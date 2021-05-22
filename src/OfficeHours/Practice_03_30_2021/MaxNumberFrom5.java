package OfficeHours.Practice_03_30_2021;

import java.util.Scanner;

public class MaxNumberFrom5 {
    /**
     * [Max and Min from 5 numbers]
     * • Write a program that can ask the user "enter a number" five times and return the maximum number
     * • Write a program that can ask the user "enter a number" five times and return the minimum number
     *
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        int numOne = scan.nextInt();
//        int numTwo = scan.nextInt();
//        int numThree = scan.nextInt();
//
        int max = 0;
//
//        if (numOne>max){
//            max = numOne
//        }
//        if(numTwo> max){
//            max = numTwo;
//        }
//        if (numThree>max) {
//            max = numThree;
//        }
//

        for (int i = 0 ; i<5 ; i++){
            System.out.println("Enter a number:");
            int number = scan.nextInt();

            if (number > max ){       // this will be repeated 5 times
                max = number;
            }
        }

        System.out.println(max);










    }
}
