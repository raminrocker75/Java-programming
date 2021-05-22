package OfficeHours.Practice_05_3_2021;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an ArrayList of Strings and a target word (String) print how many times the target word is in the ArrayList Ex:Input:”java”, ”html”, “css”,“java”, “javascript”, “selenium”
 * Target:java
 * Output:2
 */
public class targetWord {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java" ,"html" , "css" , "java" , "javascript" , "selenium"));

        String targetWord = "java";
        int count = 0;

        for (String each : words) {
            if (each.equals(targetWord)){
                count++;
            }

        }
        System.out.println(targetWord + " was found " + count + " times");

    }
}
