package Day_24_loops;
import java.util.Scanner;
public class PinCodeWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pinCode;

        int secretPinCode = 1234;
        do{
            System.out.println("Enter pin code:");
            pinCode=scan.nextInt();
//            if(secretPinCode!=pinCode){
//                System.out.println("pin code not matching");
//            }

        }while (secretPinCode != pinCode);

        System.out.println("Welcome to your account.");

    }
}
