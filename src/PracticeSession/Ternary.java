package PracticeSession;
import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter time");
        int hour = scan.nextInt();

        String time = (hour >=0 && hour <= 11) || (hour >= 12 && hour <= 24) ? "morning" : "night";
        if(hour>24){
            System.out.println("invalid");
        }else {
            System.out.println(time);
        }
    }
}
