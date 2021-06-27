package PracticeSession;

import java.util.Scanner;

public class SwitchReplPractice {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);
        //WRITE YOUR CODE HERE

        switch (response){
            case 'y':
            case 'Y':
                System.out.println("Your request is being processed");
                break;
            case 'n':
            case 'N':
                System.out.println("Thank you anyway for your consideration is printed");
                break;
            case 'h':
            case 'H':
                System.out.println("Sorry, no help is currently available is printed");
                break;
            default:
                System.out.println("Invalid entry, please try again!");
        }




    }
}
