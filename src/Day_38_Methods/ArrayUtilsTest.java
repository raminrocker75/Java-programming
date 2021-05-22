package Day_38_Methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int []nums = {5,23,1,543,90};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{23,84,46,35,65});

        System.out.println("sum = " + ArrayUtils.sum(nums));
        System.out.println("sum = " + ArrayUtils.sum(new int[] {12,56,84,68}));

        int[] nums2 = {1,45,68,965,856};
        System.out.println("5 found = " + ArrayUtils.contains(nums2,5));
        System.out.println("10 - found = " + ArrayUtils.contains(nums2,1));
    }
}
