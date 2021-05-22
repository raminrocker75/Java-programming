package Day_46_encapsulation;

public class CheckingAccount {
    private double balance;
    private int accountNumber;
    private String accountHolder;
    private String type = "checking"; // default is checking, we can change if needed with set

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
