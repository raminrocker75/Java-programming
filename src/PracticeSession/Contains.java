package PracticeSession;
import java.util.Scanner;
public class Contains {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();

        if((length1>length2) && (length1>length3) && word1.contains("a")){
            System.out.println(word1);
        }else if(length2>length1 && length2>length3 && word1.contains("a")){
            System.out.println(word2);
        }else if(length3>length1 && length3>length2 && word1.contains("a")){
            System.out.println(word3);
        }else {
            System.out.println("These words do not contain a");
        }
    }
}
