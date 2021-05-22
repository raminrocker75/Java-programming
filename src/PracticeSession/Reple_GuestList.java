package PracticeSession;

import java.util.Scanner;

public class Reple_GuestList {
    public static void main(String[] args) {
        /**
         * Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
         *
         * Ask for the first guest name.
         *
         * Then ask does user want to enter one more guests.
         *
         * If yes - take the next guest input
         *
         * If not - finish the program and print list of the guests.
         *
         * Please enter guest name:
         * Nick
         * Do you want to enter new guest name:
         * yes
         * Please enter guest name:
         * Linda
         * Do you want to enter new guest name:
         * no
         * Guest's list: Nick, Linda
         */

        Scanner input = new Scanner(System.in);


        // your code
        // ------------------------------------------

        String guestName="";
        String guestList="";
        String yesOrNo ="";
        do {
            System.out.println("Please enter guest name:");
            guestName=input.next();
            guestList += guestName;

            System.out.println("Do you want to enter new guest name:");
            yesOrNo=input.next();

            if(yesOrNo.equalsIgnoreCase("yes")){
             guestList +=",";
            }

        }while(yesOrNo.equalsIgnoreCase("yes"));

        System.out.println("Guest's list: "+guestList);




    }
}
