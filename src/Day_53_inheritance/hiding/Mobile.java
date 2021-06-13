package Day_53_inheritance.hiding;

public class Mobile extends Phone{
    String type = "Mobile phone";
    /*
    This is method hiding.
    We are hiding use() static method
     */
    public static void use(){ //static methods are hidden not over ridden
        System.out.println("Using mobile phone");
    }

    public void text(){
        use();
        System.out.println("and sending a text message");
    }
}
