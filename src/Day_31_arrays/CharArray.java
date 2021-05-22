package Day_31_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's',' ', 'f', 'u', 'n'};

        System.out.println(letters.length);

        for (char i : letters) {
            System.out.print(i);
        }
        System.out.println();


        String sentence = new String(letters);
        System.out.println("\n"+sentence);

        System.out.println();

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length); // array
        System.out.println("item.length() = " + item.length()); // String

        System.out.println();

        String[] fruit = {"bananas", "apples" , "kiwi" , "mango" , "papaya" , "Strawberry"};
        String fruitStr = "";
        for (String j : fruit) {
            System.out.print(j+"-");
            fruitStr += j+"-";
        }
        System.out.println();
        System.out.println("fruitStr= " + fruitStr );

        System.out.println();

        String [] languages = {"java" , "python" , "c++" , "sql" , "ruby" , "javascript"};

        System.out.println(String.join("|", languages));
        System.out.println(String.join("##", languages));
        String joinedLanguages = String.join("<>" ,languages);
        System.out.println("joinedLanguages = " + joinedLanguages);




    }
}
