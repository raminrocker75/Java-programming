package PracticeSession;
import java.util.Scanner;
public class NextLineGlitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter rent and month");
        double rent = scan.nextDouble();
        String month = scan.nextLine();
        System.out.println("rent = " + rent);
        System.out.println("month = " + month);


    }
}
