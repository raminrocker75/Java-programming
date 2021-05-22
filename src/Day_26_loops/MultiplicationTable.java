package Day_26_loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scan.nextInt();
        //  i is smaller than 10 and increases in every loop so the result will be different
        if(number<1 || number>10){
            System.out.println("Error : invalid number");
             return; // exit main method / stop the program. we won't reach the loop
        }

        for(int i = 1; i <= 10 ; i++){
            System.out.println(number + " * " + i + " = " + number*i );
        }

        /*
        System.out.println(number+" * " + 1 + " = " + number*1 );
        System.out.println(number+" * " + 2 + " = " + number*2 );
        System.out.println(number+" * " + 3 + " = " + number*3 );
        System.out.println(number+" * " + 4 + " = " + number*4 );
        System.out.println(number+" * " + 5 + " = " + number*5 );
        System.out.println(number+" * " + 6 + " = " + number*6 );
        System.out.println(number+" * " + 7 + " = " + number*7 );
        System.out.println(number+" * " + 8 + " = " + number*8 );
       */


    }
}
