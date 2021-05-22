package PracticeSession;
import java.util.Scanner;

/**
 * Create a program that will take the given String In and print out all the vowels from the String.
 * Input: howdyho
 * Output: oo
 */
public class Vowels {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below

        String vowels = "";

        for (int i = 0; i < word.length() ; i++) {
            switch (word.charAt(i)){
                case 'a':
                    vowels+= "a";
                    break;
                case 'e':
                    vowels += "e";
                    break;
                case 'i':
                    vowels += "i";
                case 'u':
                    vowels += "u";
                case 'o':
                    vowels += "o";
                default:
                    vowels +="";
            }
        }

        System.out.println(vowels);

    }
}
