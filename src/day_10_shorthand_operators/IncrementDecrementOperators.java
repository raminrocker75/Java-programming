package day_10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i+=1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++; // +1
        i++;//  +1
        ++i;//  +1
        ++i;//  +1
        System.out.println("i = " + i);

//       type 4 different ways of increasing.

        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode = linesOfCode + 3;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode += 5;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode++;
        System.out.println("linesOfCode = " + linesOfCode);
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

//      type 4 different ways of decreasing -1

        int i1 = 25;
        System.out.println("i1 = " + i1);
        i1 = i1 -1;
        System.out.println("i1 = " + i1);
        i1 -= 1;
        System.out.println("i1 = " + i1);
        i1--;
        System.out.println("i1 = " + i1);
        --i1;
        System.out.println("i1 = " + i1);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        ++letter;
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        letter++;// we are skipping letter cause the number is increasing;
        System.out.println("letter = " + letter);
        --letter;
        System.out.println("letter = " + letter);
        letter--; letter--; letter--;
        System.out.println("letter = " + letter);



    }
}
