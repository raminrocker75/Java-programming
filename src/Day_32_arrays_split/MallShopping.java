package Day_32_arrays_split;
import java.util.Arrays;
public class MallShopping {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99,   150.0,    9.99,     250.0 ,   439.50,      39.99};
        int[] itemIDs =   {12345 ,  12346,   12347,     12348,     12349,     12350};

        System.out.println("-------FIND THE FIRST INDEX OF 'Gloves' in items array -----");

        for (int i = 0 ; i<items.length ; i++){
            if(items[i].equals("Gloves")){
                System.out.println("The index number for item Gloves is " +i);
                break;
            }
        }

        System.out.println("-----Set boolean to true if first 'iPad' is found------");
        boolean ipadExists = false;

        for (int i = 0 ;i < items.length ;i++){
            if(items[i].equalsIgnoreCase("ipad")){
                ipadExists = true;
                break;
            }
        }
        System.out.println("iPad exists = " + ipadExists);

        System.out.println("----------Print a report of each shopping item--------------");


        for (int i = 0 ; i<items.length ; i++){
            System.out.println(items[i] +" - $" +prices[i] +" - #"+ itemIDs[i]);
        }


        System.out.println("-----Loop for 'jacket' in items and print all details----");
        for (int i = 0 ; i < items.length ; i++){
            if(items [i].equalsIgnoreCase("jacket")){
                System.out.println("item = " + items[i] + " , price = $" + prices[i] + " , item ID = #" + itemIDs[i]);
                break;
            }
        }

    }
}
