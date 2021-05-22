package OfficeHours.Practice_05_3_2021;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements
 * Ex:Input:”java”, ”html”, “css”, “java”, “javascript”, “selenium”
 * letter: ‘a’
 * Output:6
 */
public class countLettersSimilarToTargetWordButDifferentLayer {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java" ,"html" , "css" , "java" , "javascript" , "selenium"));

        char tagetLetter = 'a';
        int count = 0;

        for (String each : words) {

            for (int i = 0 ; i < each.length() ; i ++) {
                if (each.charAt(i) == tagetLetter){
                    count++;
                }
            }

        }
        System.out.println(tagetLetter + " was found " + count + " times");

    }

}
