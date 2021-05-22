package Day_46_encapsulation;

public class capitalOne {
    public static void main(String[] args) {
        CheckingAccount capital1 = new CheckingAccount();
        capital1.setBalance(135000);
        capital1.setAccountNumber(232456213);
        capital1.setAccountHolder("Ramin Dadari");
        capital1.setType("Savings");
        System.out.println(capital1);
    }
}
