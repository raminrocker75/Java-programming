package PracticeSession;
import java.util.Scanner;
public class NextVsNextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent:");
        int num1 = scan.nextInt();
        System.out.println("Enter month:");
        scan.nextLine(); // if this scan statement wasn't we wouldn't be able to type the month
        String month = scan.nextLine();
        System.out.println(num1 +" "+month);

    }
}
