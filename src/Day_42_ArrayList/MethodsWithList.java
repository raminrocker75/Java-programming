package Day_42_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * methodName: printStrList
 * param: List of Strings
 * return: void
 * prints all values separated by space in same line
 */


public class MethodsWithList {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("hot"); words.add("java"); words.add("chocolate") ; words.add("chip");
        printStrList(words);
        System.out.println();
        printStrList(Arrays.asList("select" , "option" , "br" , "python" ,"sql" , "api"));


        List<Integer>nums = new ArrayList<>();
        nums.add(45); nums.add(54); nums.add(1);

        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);

//        System.out.println(sumIntegerList(nums));


    }
    public static void printStrList(List<String> stringList){

        for (String each: stringList) {
            System.out.println(each + " ");
        }
    }

    public static int sumIntegerList(List<Integer> integerList){
        int sum= 0;
        for (int each : integerList){
            sum += each;
        }

        return sum;
    }

}
