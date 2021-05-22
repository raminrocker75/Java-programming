package group10_meeting;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        for (int i = 20; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println("\n\n\n");

        int i= 0;

    while(i <=100 ){
        System.out.println(i);
        i++;
    }

        System.out.println("\nwrite:");

    String endword = "end";

        Scanner scan = new Scanner(System.in);

        String userinput = "";

        while (!userinput.equals(endword)){
            System.out.println("please enter a word");
            userinput=scan.next();
        }

        System.out.println("out of the loop");


        System.out.println("\n");

        String endword1 = "end";

        String user = "";

        do {
            System.out.println("please enter word");
            user= scan.next();

        }while (!user.equals(endword));


        System.out.println("out of the loop");


    }
}
