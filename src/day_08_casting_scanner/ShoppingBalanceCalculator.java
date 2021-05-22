package day_08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {

        double balance = 345.55;

        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15;

        double remainingBalance=  balance - ( price1+ price2 + price3);
        System.out.println("your initial balance is: $"+ balance);
        System.out.println("your remaining balance is: $" + remainingBalance);

        int balanceWithNOCents = (int)remainingBalance;
        System.out.println("Your remaining balance without cents: $"+balanceWithNOCents);



    }
}
