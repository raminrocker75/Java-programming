package Day_29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {
        for(int minute = 1 ; minute<=5 ; minute++){
            System.out.println("\nminutes= " + minute);
        for (int seconds = 1 ; seconds<=60 ; seconds++){
            System.out.print(seconds + " ");
        }
        }
        System.out.println("\n==========================================================================");
        for(int minutes = 0 ; minutes<=4 ; minutes++){
            for (int seconds = 0 ; seconds<=59 ; seconds++){
                System.out.println("Minutes= " + minutes + " : " + seconds + " =Seconds");
                Thread.sleep(10);
            }
        }
        System.out.println("\n============================================================================");



    }
}
