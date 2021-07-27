package Day_57_Absteraction_Polymorphism.abstract_class_vs_interface;

public abstract class AbstractA {
    int num1;
    private double price;
    public static int count;
    public final String type = "abstract";
    public static final String LANGUAGE = "Java";

    // private abstract void absMethodA();  abstract method cannot be private
    public abstract void absMethodA();

    public void methodB() {
        System.out.println("MethodB Called");
    }

    public static void staticMethodC() {
        System.out.println("static methodC is called");
    }
}
