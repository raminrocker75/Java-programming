package PracticeSession;
import java.util.Scanner;
public class TeslaPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("****Happy shopping Tesla and living the electric LifeStyle****");
        System.out.println("Tesla Model 3 press 3 ------------------Tesla Model S press the Letter S");
        System.out.println("Enter your favorite Tesla Model: ");
        int teslaModel = scan.nextInt();
        String teslaModelS = "s";
        int range = 353;
        int topSpeed = 145;
        double zeroTo60= 4.2;
        boolean longRange = true;

        if(teslaModel == 3 && longRange) {
            System.out.println("Range: " + range + "mi");
            if (teslaModel == 3){
                System.out.println("Top Speed = " + topSpeed + "mph");
                if (teslaModel == 3) {
                    System.out.println("0-60 = " + zeroTo60);
                }
            }
        }else if(teslaModelS.equals("S") && longRange) {

            System.out.println("");
        }





    }
}
