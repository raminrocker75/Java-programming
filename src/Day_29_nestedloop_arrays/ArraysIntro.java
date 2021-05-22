package Day_29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10 ; //single variable
        int[] nums = new int[3] ; // array variable
        nums[0]= 5;
        nums[1]= 10;
        nums[2]= 7;

        System.out.println("Value at index 0 = "+nums[0]);
        System.out.println("Value at index 1 = "+nums[1]);
        System.out.println("Value at index 2 = "+nums[2]);

        int i = 0;
        System.out.println(nums[i]);//5
        i++;
        System.out.println(nums[i]); // 10

        // how to find the size of the array.
        System.out.println("number of elements= " + nums.length);

        int len = nums.length;
        System.out.println("len = " + len);

        nums[0] = 12;
        nums[1] = 13;
        nums[2] = 50;
        System.out.println("nums = " + nums[0]);
        System.out.println("nums = " + nums[1]);
        System.out.println("nums = " + nums[2]);

    }
}
