package Day_31_arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.util.Arrays.sort;

public class ArraysUtil {
    public static void main(String[] args) {
        int [] numbers = {100,5,7,0,-4,44,33};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("min value = "+ numbers[numbers.length-1]);

        String[] words = {"java", "C#","C++" , "kotlin" , "python", "Ruby" , "Assembly"};

        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join("," , words)+ "]");


        Arrays.sort(words);
        System.out.println(Arrays.toString(words)); // sorting


        // sort words in reverse order

        Arrays.sort(words, Collections.reverseOrder());



    }
}
