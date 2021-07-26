package Day_61_exception_collection;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 30;
        System.out.println("Class is going on for " + minutes + " minutes");
        if (minutes>50){
            throw new BreakTimeException("It is break time!");
        }

        System.out.println("Let's continue the class");

        double balance = 400.0;
        double itemPrice = 500.0;
        System.out.println("I have $" + balance+ " and purchasing item for $" + itemPrice);
        if (itemPrice > balance){
            throw new insufficientBalanceException("Transaction declined. Not enough funds :(");
        }
        System.out.println("Item successfully purchased");

    }
}
