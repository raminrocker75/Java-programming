package day_09_scanner_practice;


import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles: ");
//       double miles = 10.0; this would be hard coded so we do it like line below to be able to enter whatever numbers we want.
        double miles= scan.nextDouble();
        double kiloMeters = miles * 1.609;
        System.out.println(miles+ " Miles in kilometer is : " + kiloMeters);


    }
}
