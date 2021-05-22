package Day_45_oop;

public class object {
    public static void main(String[] args) {
       Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());
        // not : myCoffee.type = "Turkish coffee"; INSTEAD using a method
        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = " +myCoffee.getType());

        //describe my.Coffee - show all variable values
        System.out.println(myCoffee.toString());

        //Add Another Coffee Object, Set Values , Call methods
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());
        // assign coffee1 object  to coffee2
        //hey java, point coffee2 to same object as coffee1
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 = " + coffee2.getType());
        coffee2.setType("Espresso");

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappuccino");

        coffee3 = coffee2;
     System.out.println("coffee3 = " + coffee3.getType());

     Coffee coffee4 = null;//reference variable does not refer/point to any object in HEAP
     coffee4.setType("Turkish");//NullPointerException


    }



}
