package Day_32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {

        String words ="java:python:selenium:html";

        String[] wordsArrays = words.split(":");
        System.out.println(Arrays.toString(wordsArrays));
        System.out.println(wordsArrays.length);


        for (String each: wordsArrays){
            System.out.println(each + " ");

        }
        System.out.println();
        System.out.println("===================================");
        System.out.println();
//        String sentence = "today i am coding java arrays";
//        String []s = sentence.split(" ");
//        System.out.println(Arrays.toString(s));
//        System.out.println(s.length+ " is the number of words");
//        for (int i = 0 ; i< s.length ; i++){
//            System.out.println(s[i] +"- number of index = " + i);
//        }
//
//        for (String each: s){
//            System.out.println(each);
//        }

        String sentence = "today I am coding java arrays";
        String[] wordsInSentence = sentence.split(" ");
        System.out.println("first word: " + wordsInSentence[0]);
        System.out.println("first word: " + sentence.split(" ")[0]);
        System.out.println("Number of words in sentence = " + wordsInSentence.length );

        for(String each : wordsInSentence) {
            System.out.println(each);
        }


    }
}
