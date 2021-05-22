package PracticeSession;
import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int people = scan.nextInt();
        if (people == 0 || people <= 2) {
            System.out.println("Live with less than two people.");
        } else if (people == 3 || people <= 6) {
            System.out.println("Live with 3 - 6 people.");
        } else {
            System.out.println("Live with more than 6 people.");
        }

        System.out.println("What city do u live in?");
        scan.nextLine();
        String city = scan.nextLine();
        System.out.println("Do you live down town?");
        String downTown = scan.next();
        if (downTown.equalsIgnoreCase("yes")) {
            System.out.println("Have you thought about moving to the suburbs?");
            String reply = scan.next();
            if(reply.equalsIgnoreCase("Yes")){
                System.out.println("Do it. It is great");
            }else {
                System.out.println("You should think about it");
            }
        }

        System.out.println("What's your favorite animal?");
        String animal = scan.next();
        System.out.println("wow " + animal + " is a great animal");
        System.out.println("How many pets do you want?");
        int count = scan.nextInt();
        System.out.println("Do you want " + count + " " + animal+ "?");




    }
}
