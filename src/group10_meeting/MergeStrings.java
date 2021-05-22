package group10_meeting;

import java.util.Scanner;

/*
User is given two Strings, which could vary in length, merge these Strings so these Strings are combined into one String. Any extra characters from mismatched length String are at the end.

Ex:String one = abc
String two = defgh
Output:adbecfgh

Ex:String one = java
String two = is
Output:jiasva
 */
public class MergeStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String one = scan.nextLine();
        String two = scan.nextLine();

        if (two.length() > one.length()) {
            for (int i = 0; i < one.length(); i++) {
                System.out.print("" + one.charAt(i) + two.charAt(i));
            }
            System.out.println(two.substring(one.length()));
        } else if (one.length() > two.length()) {
            for (int j = 0; j < two.length(); j++) {
                System.out.print("" + one.charAt(j) + two.charAt(j));
            }
            System.out.println(one.substring(two.length()));
        } else {
            for (int i = 0; i < one.length(); i++) {
                System.out.print("" + one.charAt(i) + two.charAt(i));
            }
        }

    }
}
