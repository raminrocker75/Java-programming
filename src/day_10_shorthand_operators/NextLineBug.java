package day_10_shorthand_operators;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and month");
        double rent = scan.nextDouble();
        scan.nextLine(); // it jumps to the next line acts like \n
        String month = scan.next();
        System.out.println("My rent is = " + rent );
        System.out.println("Month = " + month);


    }
}
