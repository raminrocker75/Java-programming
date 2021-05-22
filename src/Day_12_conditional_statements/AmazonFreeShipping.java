package Day_12_conditional_statements;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price:");
        double total = scan.nextDouble();
        if(total<25.55){
            System.out.println("This order is not qualified for free shipping. Your order total:$"+total);
        }else{
            System.out.println("is qualified for free shipping. Your order total: $" + total);
        }
        System.out.println("****Thanks for shopping at Amazon****");

    }
}
