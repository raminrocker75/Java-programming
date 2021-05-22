package OfficeHours.Practice_05_3_2021;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. 
 * Ex:Input: “123”,“34”,“513”
 * Output:[ 6, 7, 9 ]
 */
public class StringNumbersToSum {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123" , "34" , "513"));

        for (int i = 0 ; i<list.size() ; i++) {
            int totalSum = 0;
            for (char digit : list.get(i).toCharArray()){
                totalSum += Integer.parseInt("" + digit);
            }
            list.set(i , "" + totalSum);
        }

        System.out.println(list);
    }
}
