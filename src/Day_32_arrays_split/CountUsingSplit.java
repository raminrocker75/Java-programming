package Day_32_arrays_split;

import java.util.Arrays;

public class CountUsingSplit {
    public static void main(String[] args) {
        String catsTypes = "bengal cat tabby cat persian cat no cat here";
        String [] catsArray = catsTypes.split("cat");
        System.out.println("number of 'cat' = " + (catsArray.length-1));

        for (String each : catsArray) {
            System.out.println(each.trim());
        }




    }
}
