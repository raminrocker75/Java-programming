package Day_12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'B';
        System.out.println(letter1==letter2); // There's number behinf each letter.
        System.out.println(letter2<letter1);
        System.out.println(letter1>letter2);
        System.out.println(letter1>=letter2);
        System.out.println(letter1<=letter2);
        System.out.println(letter1!=letter2);

        char grade = 'A';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam: " + pass);









    }
}
