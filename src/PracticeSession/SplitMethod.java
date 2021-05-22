package PracticeSession;

/**
 * The method person has a string arguement with this format:
 * "name,last name,age". Print out the person's information
 * <p>
 * Example:
 * <p>
 * person("jon,doe,30");
 * <p>
 * output:
 * person name: jon
 * last name: doe
 * age: 30
 * person("jon,doe,30");
 * <p>
 * output:
 * person name: jon
 * last name: doe
 * age: 30
 * hint: use the split method to split the string to a string array where there is a "," char
 */

import java.util.Scanner;

public class SplitMethod {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }

    public static void person(String info) {
        //your code here
        String[] word = info.split(",");
        System.out.println("person name: " + word[0]);
        System.out.println("last name: " + word[1]);
        System.out.println("age: " + word[2]);

    }
}
