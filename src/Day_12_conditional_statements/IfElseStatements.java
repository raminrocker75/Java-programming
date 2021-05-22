package Day_12_conditional_statements;

public class IfElseStatements {
    public static void main(String[] args) {
        if(10>5){
            System.out.println("Condition is True -> 10 is greater than 5");
        }else {
            System.out.println("false");
        }

        int count = 25;
        System.out.println();

        if(25>30){
            System.out.println("condition is true ->25 is greater than 30");
        }else{
            System.out.println("false it is not bigger than 30");
        }
        System.out.println();

        byte age = 14;
        if(age >= 18){
            System.out.println("You are eligible to vote");
            System.out.println("Age is greater or equal to 18");
        }else{
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than 18");
        }






    }
}
