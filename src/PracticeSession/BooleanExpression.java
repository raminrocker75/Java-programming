package PracticeSession;

import java.util.Scanner;

public class BooleanExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scan.nextInt();
        boolean isDivisibleBy2 = number % 2 == 0;
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        if (isDivisibleBy2){
            System.out.println(number + " is divisible by 2: " + isDivisibleBy2);
        }
        if (isDivisibleBy3){
            System.out.println(number + " is divisible by 3: " + isDivisibleBy3);
        }
        if (isDivisibleBy5){
            System.out.println(number + " is divisible by 5: " + isDivisibleBy5);
        }



    }
}
