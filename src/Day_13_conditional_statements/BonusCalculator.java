package Day_13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        int bonus = 0;
        double salesAmount = 2000.55;
        if (salesAmount <= 2000) {             //IF has to be boolean condition!
            System.out.println("Good job, you qualify for bonus");
            bonus = 50;
        } else {
            System.out.println("Great job, you are qualified for full bonus");
            bonus = 100;
        }
        System.out.println("Your bonus for sales amount is $" + bonus);
    }
}
