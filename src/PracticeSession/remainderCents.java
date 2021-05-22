package PracticeSession;
import java.util.Scanner;
public class remainderCents {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter cents");
        int cents = scan.nextInt();
        int dollars = cents/100;
        int remainderCents = cents%100;

        System.out.println(dollars + " Dollars");
        System.out.println("in " + cents + "cents: " + dollars + " dollars " + remainderCents +" remaining cents");
    }
}
