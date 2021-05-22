package Day_43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
       long start = System.nanoTime();
        List<Integer>mlnNums = method1();
       // System.out.println(mlnNums);
        long end = System.nanoTime();
        double listSeconds = (end-start) / 1000_000_000.0;
        System.out.println("ArrayList time = " + (end-start));
        System.out.println("ArrayList seconds = " + listSeconds);

        long st = System.nanoTime();
        int [] arr = getIntegerArray();
        long en = System.nanoTime();
        double seconds= (en-st) / 1000_000_000.0;

        System.out.println("Array time = " + (en-st));
        System.out.println("Array time seconds = " + seconds);

    }
    public static List<Integer>method1(){
        List<Integer>list= new ArrayList<>();
        for (int i = 0; i <= 1000000; i++) {
           list.add(i);
        }

        return list;
    }


    public static int[] getIntegerArray(){
        //declare empty array with size -1000001
        int [] nums = new int[1000001];
        for (int i = 0; i <= 1_000_000; i++) {
            nums[i] = i;
        }
        return nums;
    }
}
