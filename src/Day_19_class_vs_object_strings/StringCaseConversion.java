package Day_19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CYBERTEK";

        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("JAVA".toLowerCase());

        String wordInLCase = word.toLowerCase(); // because our word is CYBERTEK and it's printing out all LowerCase
        System.out.println("WordInLCase " + wordInLCase);

        word = word.toLowerCase();
        System.out.println("word= " + word);


    }
}
