package PracticeSession;

import java.util.Random;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Random random= new Random();
        int secretNumber = random.nextInt(101);
        int guessNumber;
        int numberOfAttempts = 1;
        System.out.println("Enter guessing Number:");
        do {

            guessNumber = scan.nextInt();

            if(guessNumber>secretNumber){
                System.out.println("Guss number too large");
            }else if(guessNumber<secretNumber){
                System.out.println("Guess number too small");
            }

            if(numberOfAttempts == 3) {
                System.out.println("better luck next Time");
                return;
            }
            numberOfAttempts++;

        }while (guessNumber!=secretNumber);

        System.out.println("Congrats you have won!");


    }
}
