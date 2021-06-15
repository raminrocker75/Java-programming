package PracticeSession;

import java.util.Arrays;
import java.util.Scanner;

public class FindNoneDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {1, 1, 2, 3, 4, 3, 4};
        //TODO: write your code below

        Arrays.sort(nums);
        for (int each:
             nums) {
            System.out.print(each);
        }

        for (int i = 0; i < nums.length; i++) {
            int count =0;

            for (int each : nums) {
                if (each == nums[i]){
                    count++;
                }
            }
            System.out.println();
            if (count==1){
                System.out.println(nums[i]);
            }
        }
    }
}

