package day_09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("*******Welcome to  target********");
        System.out.println();

        System.out.println("Enter price for milk: ");
        double milk = scan.nextDouble(); // we dont put the price here cause we dont want it to be hard coded.

        System.out.println("Enter price for Bread: ");
        double bread = scan.nextDouble(); // we type the same thing cause we also dont want to enter the price as hard coded

        System.out.println("Enter the price for cucumbers: ");
        double cucumbers = scan.nextDouble();

        double total = milk + bread + cucumbers;
        System.out.println("Total price is: " + total);

    }
}
