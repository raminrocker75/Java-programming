package PracticeSession;
import java.util.Scanner;
public class FirstAndLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);
        System.out.println(""+first+last);
    }
}
