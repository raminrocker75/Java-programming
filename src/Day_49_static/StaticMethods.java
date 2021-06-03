package Day_49_static;

public class StaticMethods {
    int num = 10;
    static int count = 5;

    public static void displayMessage(String message){
        System.out.println("message" + message);
//        System.out.println("num = " + num); Error: num is instance variable. static cannot access
        System.out.println("count = " + count);
    }

    public static void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("Wooden Spoon");
    }

    //staticMethod.instanceMethod(); > no
    // staticMethods stm = new StaticMethods();
    // stm.instanceMethod();
    public void instanceMethod(){
        System.out.println("InstanceMethod");
        System.out.println("num = " + num); // none static
        System.out.println("count = " + count); // static
        displayMessage("Hello from instance Method"); // static
        // none static can print either static or none static methods
    }
}
