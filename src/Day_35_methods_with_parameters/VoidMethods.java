package Day_35_methods_with_parameters;

public class VoidMethods {
    public static void main(String[] args) {
        printAtoZ();
        printAtoZ();
        for (int i= 0; i < 10; i++) {
            printAtoZ();
        }
//        System.out.println("----------Flag OF USA----------");
       usFlag();
//        System.out.println("----------Flag of USA-----------");
        usFlag();
    }
    public static void printAtoZ(){
        for (char i ='A' ; i <= 'Z' ; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void usFlag(){
        System.out.println("--------FlAG OF USA-----------------");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
    }
}
