package PracticeSession;

import java.util.Scanner;

public class MorePracticeForScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? ");
        String firstName = scan.next();
        System.out.println("Nice to meet you " + firstName);
        new Scanner(System.in);
        System.out.println();
        System.out.println("Where are you from?");
        String where= scan.next();
        System.out.println("Oh very nice ");

    }

}
