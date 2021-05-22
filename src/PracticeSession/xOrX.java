package PracticeSession;

import java.util.Scanner;
/*
Given a string word, if the first or last chars are 'x' or 'X',
print the string without those 'x' or 'X' chars, otherwise print the string unchanged.
 */
public class xOrX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        // word = xhix length = 4
        //        0123 = index

        int wordlast = word.length();

        if((word.startsWith("x") || word.startsWith("X"))&& (word.endsWith("x") || word.endsWith("X"))){

            System.out.println(word.substring(1, wordlast-1));
        }else {
            System.out.println(word);
        }





    }
}
