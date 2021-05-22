package PracticeSession;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price:");
        double totalPrice = scan.nextDouble();

        if(totalPrice>=25){
            System.out.println("Free shipping eligible");
        }else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total is " + totalPrice + "Less than minimum of $" + 25);
        }


    }

}
