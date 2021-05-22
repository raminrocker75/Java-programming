package day_09_scanner_practice;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*********Converting F to C*******");
        System.out.println();
        System.out.println("Enter Temperature : ");
        double F= scan.nextDouble();
        double C = (F - 32) * 5/9;
        System.out.println("Converting fahrenheit in Celsius is : \n"+ C);
    }
}
