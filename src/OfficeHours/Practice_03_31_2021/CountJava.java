package OfficeHours.Practice_03_31_2021;

public class CountJava {
    public static void main(String[] args) {
        String word = "java is fun. java class today, java";
        int count=0;
        while (word.contains("java")){
            count++;
            word = word.replaceFirst("java" , "");
            word=word.trim();
        }
        System.out.println("java was found " + count + " times");


    }
}
