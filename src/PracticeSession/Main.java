package PracticeSession;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //WRITE YOUR CODE HERE
            System.out.println("Enter full name:");
            String name1 = scan.nextLine();
            String name2 = scan.nextLine();

            if(name1.equalsIgnoreCase("Max Payne") || name2.equalsIgnoreCase("Alan Wake")){
                System.out.println("User found!");
            }else{
                System.out.println("User not found!");
            }





        }
    }
