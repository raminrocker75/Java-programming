package OfficeHours.Practice_03_22_2021;

import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /** next() vs nextLine()
         *
         * next() -> read String value from console
         *                  it only reads a single word -> spaces separate words
         *
         *
         *  nextLine() -> read a String value from console
         *                it will read multiple words
         *                -> also accepts the enter input.
         *
         */


        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println("Enter your name:");
        String name = input.next();

        System.out.println(number);
        System.out.println(name);




    }


}
