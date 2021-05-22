package Day_13_conditional_statements;
import java.util.Scanner;
public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("****Welcome to your ATM****");
        System.out.println("Please Enter your pin code:");
        int secretPinCode= scan.nextInt();
        if(secretPinCode==2277){
            System.out.println("Welcome to your account.");
            System.out.println("You can with draw, check balance, deposit");
        }else {
            System.out.println("incorrect pass code");
            System.out.println("please try again");
        }


    }
}
