package Day_61_exception_collection.Errors;

import java.util.ArrayList;
import java.util.List;

public class ErrorExamples {
    public static void main(String[] args) {
        //StackOverError
        try {
            myMethod();
        }catch (StackOverflowError e ){
            System.out.println("StackOverFlow Happened");
        }
        System.out.println("--After Error--");
        //OutOfMemoryError
        List<Integer> nums = new ArrayList<>();
        while(true) {
            nums.add(100);
        }

    }
    static int counter =0;
    public static void myMethod(){
        System.out.println(counter++);
        myMethod();
    }
}
