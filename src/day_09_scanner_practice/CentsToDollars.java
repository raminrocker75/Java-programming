package day_09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents: ");
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int remainingCents = cents % 100; // theres 100 cents in one dollar.
        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainingCents = " + remainingCents);
        // 132 cents : 1 dollars 23 cents
        System.out.println("in " + cents + " cents: " + dollars + " dollars " + remainingCents +" cents" );
    }
}
