package PracticeSession;
import java.util.Scanner;
public class Triple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE

        for (int i = count; i < str.length()-2; i++) {
                System.out.println(str.substring(i,i+3));
                if(str.charAt(i) == str.charAt(i+1) && str.charAt(i+1)== str.charAt(i+2)){
                    count++;
                }
        }

        System.out.println(count);
    }
}
