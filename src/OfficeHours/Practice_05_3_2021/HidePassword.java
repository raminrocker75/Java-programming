package OfficeHours.Practice_05_3_2021;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array of passwords (String). Hide each password as a star (*) and show the hidden password Ex:Input:{"one", "hi", "hold}
 * Output: [ ***, **, **** ]
 */
public class HidePassword {
    public static void main(String[] args) {
        String[] password = {"one" , "apple" , "hold"};
        ArrayList<String> hiddenPassword = new ArrayList<>();
        for (String each: password) {
            hiddenPassword.add(convertToStars(each));
        }
        System.out.println("original: " + Arrays.toString(password));
        System.out.println("hidden: "+hiddenPassword);
    }

    // helper method : method that does some action then we get to call it somewhere else
    public static String convertToStars(String str){
        String stars = "";
        for (int i = 0; i < str.length(); i++) {
            stars += "*";
        }
        return stars;
    }
}
