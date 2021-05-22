package OfficeHours.Practice_03_30_2021;
/*
Given a String str and a number n check if the prefix (made of up of the first n characters) appears in the remaining part of the String. Print true or false.

Assume that the String is not empty and that n is in the range from 1 to str.length().

input: abXYabc
input: 1

output: true

 */

import  java.util.Scanner;
public class Prefix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        String prefix = str.substring(0,n);
        String remaining = str.substring(n);

        System.out.println(remaining.contains(prefix));













    }
}
