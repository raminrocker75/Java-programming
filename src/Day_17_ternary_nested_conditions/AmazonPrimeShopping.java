package Day_17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 15.0;
        boolean isPrimeMember = false;


        if (isPrimeMember) {
            System.out.println("Eligible for free 2 day Shipping");
        } else {
            if (itemPrice >= 25) {
                System.out.println("Eligible for free regular Shipping");
            } else {
                System.out.println("Not eligible for free shipping. fee is $10");
            }
        }
    }
}
