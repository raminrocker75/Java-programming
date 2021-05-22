package Day_24_loops;
import java.util.Scanner;
public class GiveMe5Dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 Dollars");
        int dollars = scan.nextInt();

        while (dollars!=5){
            System.out.println("Give me 5 dollars");
            dollars = scan.nextInt();
        }
        System.out.println("Thank you for your generosity. Don't expect it back!");




    }
}
