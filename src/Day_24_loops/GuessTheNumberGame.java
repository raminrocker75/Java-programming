package Day_24_loops;

import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("guess the Secre Number;");
        int secNumber = 100;
        int guess;
        do {
            guess = scan.nextInt();
            if (guess>secNumber ){
                System.out.println("Wrong your number is too large");
            }else if(guess<secNumber) {
                System.out.println("Wong your number is too small");
            }
        }while (secNumber!=guess);

        System.out.println("You have won!");
    }
}
