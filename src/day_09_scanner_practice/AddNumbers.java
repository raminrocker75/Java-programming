package day_09_scanner_practice;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in); // creating the scanner object here.
        System.out.println("Enter 2 numbers");
        int num1 = scan.nextInt(); // this is based on the code on line 5 we put scan.nextInt because
        // on line 5 we named it scan and we use nextInt because we are calculating numbers.
        int numb2 = scan.nextInt();
        int result = num1 + numb2;
        System.out.println(result);
    }
}
