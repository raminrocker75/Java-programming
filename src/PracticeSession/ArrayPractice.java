package PracticeSession;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] number = new int[100];
        for (int i = 0; i <= number.length-1; i++) {
            number[i]= i+1;
        }
        for (int i : number) {
            System.out.print(i+" ");
        }
    }
}
