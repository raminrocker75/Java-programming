package day_08_casting_scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); // create scanner object

        System.out.println("Please enter your name:"); // asking question

        String firstName = scan.next();

        System.out.println("nice to meet you , " + firstName);
    }
}
