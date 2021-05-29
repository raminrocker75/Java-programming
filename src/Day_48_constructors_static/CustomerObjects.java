package Day_48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer); // print with default Values that are set in no-args constructor
        customer.setId(1);
        customer.setName("Bob");
        System.out.println(customer);

        Customer customer1 = new Customer("Mike", 2);//create object and assign values in same statement
        Customer customer2 = new Customer("John ward III" , 4873);
        System.out.println(customer2);
        System.out.println(customer1);

        //array of customer
        Customer [] todaysCustomers = {customer,customer1,customer2, new Customer("Bashir",449)};

        //arrayList of customer objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(new Customer("Ramin" , 63));
        customerList.add(new Customer("Suleyman", 9763));
        //print info of first customer object in array and arrayList
        System.out.println(todaysCustomers[0]);
        System.out.println(customerList.get(0));
        System.out.println(customerList);
        System.out.println("-------For Loop-------");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }
        System.out.println("-----for each loop-------");
        for (Customer customer3 : customerList) {
            System.out.println(customer3);
        }

        System.out.println("----Names of Customers----");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i).getName());
        }
        System.out.println("----for each loop-----");
        for (Customer each:
             customerList) {
            System.out.println(each.getName());
        }

        System.out.println("---lambda expression---");
        customerList.forEach(each-> System.out.println(each.getName()));




    }
}
