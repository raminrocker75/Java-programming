package PracticeSession;

import java.util.Scanner;

public class SaimOnly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age:");

        int age= scan.nextInt();

        if (age >= 18){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not Eligible to vote");
        }
        if(age==18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
        if(age!=18){
            System.out.println("NOt eligible to vote");
        }else {
            System.out.println("Eligible to vote");
        }
    }
}

