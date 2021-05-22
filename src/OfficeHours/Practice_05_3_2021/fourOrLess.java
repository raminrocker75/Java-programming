package OfficeHours.Practice_05_3_2021;

import Day_41_arraylist.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * GivenanArrayList of Strings, go through and read only Strings that are 4 characters or less. Take those Strings and put them into a different ArrayList
 * Ex:Input:“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
 * Output:[ tree, loop, cat ]
 */
public class fourOrLess{
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>(Arrays.asList("apples" , "tree" , "loop", "cat" , "animal" , "shortcut"));

        ArrayList<String> list2 = new ArrayList<>();

        for (String each : list) {
            if(each.length() <= 4){
                list2.add(each);
            }
        }

        System.out.println(list2);
    }
}
