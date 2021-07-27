package Day_61_exception_collection.Errors;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException  {
        System.out.println("About to sleep for 5 seconds");

        /**
         * Thread.sleep(1000); causes/throws an interrupted exception which is a checked exception
         * 1) HANDLING USING TRY/CATCH
         * 2) HANDLING USING THE KEYWORD throws
         */
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Woke up after 5 seconds");
    }
}
