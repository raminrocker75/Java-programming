package PracticeSession;

public class StaticBlock {
    static String name = "";
    static {
        name = "Ramin";
    }
//  static block is always ran before the main method we can initialize some variables int it and use it in our main
    public static void main(String[] args) {
        System.out.println("In main method");
        System.out.println("This is a practice and the name is " + name);
    }
}
