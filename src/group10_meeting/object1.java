package group10_meeting;
import java.util.*;
public class object1 {
    public static void main(String[] args) {
        string();
        name("Ramin"," is an sdet");

        System.out.println(list(10));

    }

    public static void string(){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(name);

    }

    public static String name(String a , String b){
        String sum = a + b;
        System.out.println(sum);
        return sum;
    }

    public static  List<Integer> list( int size ){
        List<Integer> arrays = new ArrayList<>();
        for (int i = 1; i <= size; i++) {

            arrays.add(i);
        }
        return arrays;
    }
}
