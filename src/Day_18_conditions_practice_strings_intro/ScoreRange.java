package Day_18_conditions_practice_strings_intro;
import java.util.Scanner;
public class ScoreRange {

    //if use || it only needs 1 side to be true to print out true so for checking ranges we shouldn't use || cause it'll give us wrong results;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter desired Score:");
        int score = scan.nextInt();
        if(score >=1 && score <= 40){
            System.out.println("D");
        }else if (score >= 41 && score <= 60) {
            System.out.println("C");
        }else if (score >= 61 && score <= 90){
            System.out.println("B");
        }else if(score >= 91 && score <=100) {
            System.out.println("A");
        }else {
            System.out.println("invalid Score");
        }
    }
}
