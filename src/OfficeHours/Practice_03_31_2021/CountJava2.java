package OfficeHours.Practice_03_31_2021;

public class CountJava2 {
    public static void main(String[] args) {

        String word = "java is fun. java class today, java";
        int count = 0;

        for (int i = 0; i < word.length() - 3; i++) {

            String eachFourLetters = word.substring(i, i + 4);

            if (eachFourLetters.equals("java")) {
                count++;
            }

        }
        System.out.println(count);
    }
}
