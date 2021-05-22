package PracticeSession;

import java.util.Arrays;
import java.util.Scanner;

public class MakeLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int [] list = new int[nums.length*2];

        for (int i = 0 ; i <nums.length * 2 ; i++){
            if (i==list.length-1){
                list[list.length-1]= nums[nums.length-1];
            }else {
                list[i] = 0;
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
