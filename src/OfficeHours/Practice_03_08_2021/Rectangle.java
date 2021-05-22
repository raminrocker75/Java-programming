package OfficeHours.Practice_03_08_2021;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {

//        PIC: package-->import--->class
// hard coded values
//        double length;
///        double width;
//        length=5;
//        width=3;
//        dynamic with scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your length: ");
        double length = scan.nextDouble();
        System.out.println("Enter your width:");
        double width = scan.nextDouble();


        double perimeter = 2 * (length + width);
        double area = width*length;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}
