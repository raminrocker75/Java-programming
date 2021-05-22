package Day_24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
//       int count = 5;
//        while (count >= 0){
//            System.out.println("countdown " + count);
//            --count;
//        }
//        System.out.println("Finished the count");

        int unreadSMS = 10;
        System.out.println("I have total of"  + unreadSMS + " \uD83D\uDC8C unread SMS" );
        while(unreadSMS > 0){
            System.out.println("Reading SMS: " +unreadSMS);
            unreadSMS--;
        }
        System.out.println("No More unread SMS messages");

    }
}


