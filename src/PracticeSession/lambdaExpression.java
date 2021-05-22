package PracticeSession;

import java.util.ArrayList;

public class lambdaExpression {
    public static void main(String[] args) {
        String str = "12345678abcdefgh!@#$%";
        ArrayList<Character> all = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            all.add(str.charAt(i));
        }

        //System.out.println(all);

        ArrayList<Character>digits = new ArrayList<>(all);
        ArrayList<Character>letters = new ArrayList<>(all);
        ArrayList<Character>special = new ArrayList<>(all);

        digits.removeIf(each->!Character.isDigit(each));
        letters.removeIf(each->!Character.isLetter(each));
        special.removeIf(eachChar -> Character.isDigit(eachChar) || Character.isLetter(eachChar));

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(special);




    }
}
