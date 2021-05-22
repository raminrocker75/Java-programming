package PracticeSession;

import java.util.Scanner;
/*
n this assignment, you will write a program that will generate a shopping list. It's more advanced version of assignment Shopping list I.

Your program should ask use to enter items followed by its price. After adding item, ask user if he wants to add one more item. If so, repeat previous steps again. If no, print shopping list report and total price as show in examples. Your program should accept up to 10 items.

Hint: use do while loop.
 */
public class ShoppingListLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


        do {
            System.out.println("Enter Item1 and its price:");
            item=scan.nextLine();
            price=scan.nextDouble();
            if(item.equals(count) ){
                System.out.println("Add one more item?");
                countinue = scan.nextLine();
                if (countinue.equals("Yes")){
                    System.out.println("Enter Item2 and its price:");
                    item=scan.nextLine();
                    price=scan.nextDouble();
                }
            }

        }while (count++<10);



    }
}
