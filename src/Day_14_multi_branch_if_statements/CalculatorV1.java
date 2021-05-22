package Day_14_multi_branch_if_statements;

import java.util.Scanner;

public class CalculatorV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  number1:");
        double num1 = scan.nextDouble();
        System.out.println("Enter number 2:");
        double num2 = scan.nextDouble();
        System.out.println("Enter operator:");
        char operators = scan.next().charAt(0) ;
        if (operators == '+') {
            System.out.println(num1 + num2);
        } else if (operators == '-') {
            System.out.println(num1 - num2);
        } else if (operators == '*') {
            System.out.println(num1 * num2);
        }else if (operators == '/'){
            System.out.println(num1/num2);
        }else {
            System.out.println("invalid operator");
        }
    }
}
