package PracticeSession;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        /**
         * Print the number of times that the string "java" appears anywhere in the given string word
         */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int count = 0;
        word = word.toLowerCase();
        while (word.contains("java")) {
            count++;
            word = word.replaceFirst("java", "");
            word = word.trim();
        }

        System.out.println(count);


    }
}
