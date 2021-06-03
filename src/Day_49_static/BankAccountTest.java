package Day_49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        MyBankAccount husband = new MyBankAccount();
        husband.user = "Husband";
        husband.showBalance();
        husband.spendingLimit(100);
        husband.showBalance();

        MyBankAccount wife = new MyBankAccount();
        wife.user = "Wife";
        wife.showBalance();
        wife.spendingLimit(1000);
        wife.showBalance();
    }
}
