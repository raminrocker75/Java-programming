package Day_57_Absteraction_Polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
//        AbstractA absa = new AbstractA();                 We cannot create object(instantiate) neither of them
//        InterfaceA interfaceA = new InterfaceA();

        InterfaceA.staticMethodE("WoodenSpoon"); //static method don't need object it can be directly called.

    }
}
