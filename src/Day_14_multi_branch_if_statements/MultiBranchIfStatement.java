package Day_14_multi_branch_if_statements;
import java.util.Scanner;
public class MultiBranchIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the days \n1 = monday , 2=tuesday , 3=wednesday :");
        int day =scan.nextInt();
        boolean answer = true;
        if (day == 1) {
            System.out.println("Monday - " + answer);
        } else if(day==2){
            System.out.println("Tuesday - " + answer);
        }else if (day==3){
            System.out.println("Wednesday - " + answer);
        }else{
            System.out.println("It's java day");
        }
        System.out.println();
        System.out.println("Thanks for checking out the days of the week with us thank you!" );

    }
}
