package PracticeSession;

public class PlusPlusMinusMinus {
    public static void main(String[] args) {
        int a = 200;
        int b = -a++ + - --a * a-- % 2 + a;
        System.out.println(b);

        int a1 = 300;
        int b2 = -a1-- + + ++a1 * a1++ %2 + a1;
           // a = 300 -1
          //  b = -300 + ((300 * 300) % 2)) + 301
                 System.out.println(b2);


    }
}
