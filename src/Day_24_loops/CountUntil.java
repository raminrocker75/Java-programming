package Day_24_loops;
import java.util.Scanner;
public class CountUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scan.nextInt();
        int count = 1;
        while(count<=number){
            System.out.print("Reached the count:" + count +"     ");
            count++;
        }
    }
}
