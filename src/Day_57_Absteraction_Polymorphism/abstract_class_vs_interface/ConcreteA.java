package Day_57_Absteraction_Polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA,InterfaceB{
    @Override
    public void absMethodA() {
        System.out.println("absA implementation is called");
    }
    @Override
    public void methodB(){
        System.out.println("methodB overridden version is called");
    }


//    @Override-> static methods are hidden
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden version is called");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overriden version is called - " + num);
    }
}
