package Day_32_arrays_split;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        String reversed = "";
        for (int i = words.length-1 ; i>=0 ; i--){
            System.out.print(words[i] + " ");
        reversed += words[i]+ " ";
        }

        System.out.println("sentence = " + sentence);
        System.out.println("reversed = " + reversed.trim());





    }
}
