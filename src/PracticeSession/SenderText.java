package PracticeSession;
import java.util.Scanner;
public class SenderText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
        // we can put int value into subString
        sender=message.substring(message.indexOf("<")+1,message.indexOf(">"));
        phoneNumber=message.substring(message.indexOf("[")+1,message.indexOf("]"));
        messageBody=message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("sender: " + sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("messageBody: " + messageBody);
    }
}
