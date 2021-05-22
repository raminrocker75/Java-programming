package Day_22_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "  java  ";
        System.out.println(word.trim());

        word = " S Q L ";
        System.out.println(word.trim());

        word = word.replace(" ", "");
        System.out.println(word.trim());
        System.out.println();
        // chaining String methods;

        String word1 = "    he llo wor ld   ";
        System.out.println(word1.toUpperCase().toLowerCase().length());
        System.out.println(word1.replace(" ", "").toUpperCase());

        String city = "Chicago";
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());

        String capitalized = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println(capitalized);

    }
}
