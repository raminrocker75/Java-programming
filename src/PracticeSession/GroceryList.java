package PracticeSession;
import java.sql.SQLOutput;
import java.util.Scanner;
public class GroceryList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price for Banana: ");
        double banana = scan.nextDouble();

        System.out.println("Enter price for milk: ");
        double milk = scan.nextDouble();

        System.out.println("Enter price for chocolate: ");
        double chocolate = scan.nextDouble();

        double total= banana + milk + chocolate;
        System.out.println("Your total price is : " + total);



    }

}
