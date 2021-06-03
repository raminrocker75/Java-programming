package Day_49_static;

public class MyBankAccount {
    static double balance = 700;
    String user = "Ramin";

    public void spendingLimit(double amount) {
        System.out.println(user + " is spending $" + amount);
        balance -= amount;
    }

    public void showBalance(){
        System.out.println("Current balance is " + balance);
    }

}
