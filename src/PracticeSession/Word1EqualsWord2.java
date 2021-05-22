package PracticeSession;
import java.util.Locale;
import java.util.Scanner;
public class Word1EqualsWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        email=email.toLowerCase();
        int underScore = email.indexOf ("_");
        int atSign = email.indexOf("@");
        int dot=email.indexOf(".");
        String firstLetter = email.substring(0,1);
        String firstName = email.substring(1,underScore);
        String lastName = email.substring(underScore+2,atSign);
        String firstLast = email.substring(underScore+1,underScore+2);
        String domain = email.substring(atSign+1,dot);

        System.out.println("First name: "+firstLetter.toUpperCase()+firstName);
        System.out.println("Last name: "+firstLast.toUpperCase()+lastName);
        System.out.println("Domain: " + domain);



    }
}
