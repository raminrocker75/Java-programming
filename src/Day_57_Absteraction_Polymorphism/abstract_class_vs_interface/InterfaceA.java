package Day_57_Absteraction_Polymorphism.abstract_class_vs_interface;

public interface InterfaceA extends InterfaceB{
    public static final String TYPE = "Interface";
    double MAX_Count =500; // this is also public static final

//    public InterfaceA(){
//        System.out.println("constructor is not welcomed in                                Interface")
//    }

    public abstract void absMethodD(int num);

    /**
     * starting from java 8(jdk1.8)
     * interface can have static and default methods
     */

    public static void staticMethodE(String str){
        System.out.println("static method E is called with message str - " + str);
    }

    public default void defaultMethodF(){
        System.out.println("defaultMethod F is called");
    }
}
