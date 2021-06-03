package Day_49_static;

public class StaticTest {
    static String word = "Java";
    public static void main(String[] args) {
        // 1) static methods can be called using className
        StaticMethods.displayMessage("Wooden Spoon");
        // 1) instance method needs an object to be called
//        StaticMethods.instanceMethods(); error
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        // 2) static method can only access other static variables and methods
        System.out.println(word);
    }
}
