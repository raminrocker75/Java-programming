package Day_42_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character>letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j','a', 'v', 'a' , 'i' , 's' , 'f' , 'u' ,'n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed = "+letters);

        System.out.println(Collections.frequency(letters,'a'));

        int vCount = Collections.frequency(letters , 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters , 'a' , 'u');
        Collections.replaceAll(letters, 'i', 'j');
        System.out.println("after replaceAll = " + letters);

        Collections.sort(letters);
        System.out.println("after sorting = " + letters);

        List<Integer> nums = Arrays.asList(23,1,43,1,5,5,5,5,5,234,7,-9,0);

        System.out.println("nums = " + nums);
        Collections.sort(nums);
        System.out.println("nums after sorting = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);



        System.out.println("max = " +max);
        System.out.println("min = " + min);

        int countOfFives = Collections.frequency(nums , 5);
        System.out.println("CountofFives = " + countOfFives);


        int countOf1s = Collections.frequency(nums, 1);
        System.out.println("countOf1s = " + countOf1s);

        Collections.replaceAll(nums,5,50);
        System.out.println("After replaceAll = " + nums);

        Collections.sort(nums , Collections.reverseOrder());
        System.out.println("after  reverse sort = " +nums );

        Collections.shuffle(nums);
        System.out.println("After shuffle = " +nums);


    }
}
