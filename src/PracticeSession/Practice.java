package PracticeSession;
import java.util.Scanner;




public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your DOB: "); //
        int DOB = Integer.parseInt(scan.next());
        System.out.println("What is the current year?");
        int CurrentYear = Integer.parseInt(scan.next());
        int YourAge = CurrentYear - DOB ;
        System.out.println("OH MY GOD!! You Are " +YourAge+ " YEARS OLD");

    }
}


