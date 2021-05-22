package PracticeSession;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("What are you searching for: ");
        String Search= scan.next();
        System.out.println("Ok you got it. Thanks for visiting our Website!");
        System.out.println();
        Scanner Scan2= new Scanner(System.in);
        System.out.println("What can i do for you next: ");
        String Search2= Scan2.next();
        System.out.println("Here's what i've found for you, Would you want me to open it for you: ");
        Scanner scan3= new Scanner(System.in);
        String type; scan3.next();
        System.out.println("Great, i got you!");



    }
}
