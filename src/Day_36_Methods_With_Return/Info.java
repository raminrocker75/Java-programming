package Day_36_Methods_With_Return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        System.out.println("fullName = " + fullName());
        System.out.println("Age is = " +age());
        System.out.println("Martial Status = " + isMarried());
        System.out.println("Birth year = "+getRandomYear());
        String name = fullName();
        boolean married = isMarried();
        int age = age();
        int year = getRandomYear();
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("year = " + year);
        System.out.println("married = " + married);
    }
    public static String fullName(){
//        System.out.println("inside fullName method");
        return "Ramin Dadari";
    }
    public static int age(){
        int age = 25;
        return age;
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
