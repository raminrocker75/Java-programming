package Day_38_Methods;

public class RecursiveMethod {
    public static void main(String[] args) {
        printNums(1);
    }

    public static void printNums(int num) {
        System.out.println(num+" ");
        num++;
        if(num<=100) {
            printNums(num);
        }
    }
}
