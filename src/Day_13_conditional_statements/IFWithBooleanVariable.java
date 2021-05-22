package Day_13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if(isHungry){
            System.out.println("I'm hungry i'll go get something to eat\n,Then code java");
        }else{
            System.out.println("I am not hungry, Lets keep coding java");
        }

        double price = 130.44;
        boolean isAffordable = price<=200.0;
        if (isAffordable){
            System.out.println("Not affordable, bank account needs money injected!");
        }else {
            System.out.println("is affordable, i'm rich!");
        }
        boolean isRemoteJOb= false;
        if(isRemoteJOb != true){
            System.out.println("Sorry i am not interested ");
        }else {
            System.out.println("Sure i am interested, what is the interview process?");
        }


    }
}
