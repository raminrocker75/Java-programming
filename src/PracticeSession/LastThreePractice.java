package PracticeSession;

import java.util.Scanner;

public class LastThreePractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a word that has 3 characters or more");
        String word = scan.next();
        if(word.length()>3){
            System.out.println(wordFactory(word));
            return;
        }else {
            System.out.println("Not matching the requirement");
        }
    }
    public static String wordFactory(String word){
        String sentence = "";
        sentence += word.substring(word.length()-3);
        return sentence;
    }
}
