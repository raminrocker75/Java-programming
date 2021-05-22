package PracticeSession;

import java.util.Scanner;

public class DuplicateCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        String duplicate = "";
        int j = 0;
        for (int i = 0; i < word.length(); i++) {
            //System.out.println(word.charAt(i));
            int count = 0;
            for (j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                duplicate += word.charAt(i);
            }
        }

        System.out.println("duplicate letter: " + duplicate);


    }
}
