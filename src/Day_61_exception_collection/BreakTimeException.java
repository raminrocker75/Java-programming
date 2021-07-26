package Day_61_exception_collection;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException(){

    }

    public BreakTimeException(String message){
        super(message);
    }

}
