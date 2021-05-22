package Day_35_methods_with_parameters;

public class MethodsWithParams {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(94);
        displayValue(9+1);
        displayValue(10);
        int count = 88;
        displayValue(count);
        greetByName("Murodil");
        greetByName("Suleyman");
        greetByName("Nadir");
        String name = "Ramin";
        greetByName(name);
    }
    public static void displayValue(int num){
        System.out.println("The value is " + num);
    }

    public static void greetByName(String name){
        System.out.println("Hello " + name +", how are you today?");
    }
}
