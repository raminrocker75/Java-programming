package Day_43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import  java.util.Random;
public class ListMethods {
    public static void main(String[] args) {
        List<String> dayNames = getDays();
        System.out.println(dayNames);
        System.out.println("getDays().size() = " + getDays().size());
        System.out.println("getDays().get(0) = " + getDays().get(0));
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");

        dayNames.removeIf(day -> day.length() == 6);
        System.out.println("dayNames after remove if = " + dayNames);

        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf( n -> n < 90);// remove nums less than 90
        System.out.println("nums = " + nums);

    }

    public static List<String> getDays(){
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        return  days;
    }

    public static List<Integer> getRandomList(int size){
        Random randomNUm = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= size ; i++) {
            list.add(randomNUm.nextInt(101)); // generate random number and add to list
        }
        return list;
    }

}
