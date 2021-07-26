
package Day_61_exception_collection;
public class insufficientBalanceException extends RuntimeException{
    public insufficientBalanceException() {
    }

    public insufficientBalanceException(String message) {
        super(message);
    }

}

