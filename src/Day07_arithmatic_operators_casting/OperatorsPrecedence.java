package Day07_arithmatic_operators_casting;

public class OperatorsPrecedence {
    public static void main(String[] args) {
        System.out.println(10+5);//15
        System.out.println(10+5-3);//12
        System.out.println(10-5+3);//8
        System.out.println(10-(5+3));//2


        System.out.println(2*3);//6
        System.out.println(2 * 3 / 3);//2
        System.out.println(20 / (2*2));// 20 divided by 4 = 5
        //System.out.println(10/0); cannot divide by zero. error while the code running.

        System.out.println(2 + 5 * 3);//17
        System.out.println((2+5)*3); // 21 because of parenthesis.

        // in java, if you try to divide any number by zero error will happen during run time.

        //int num=10;
                                   //error exception for dividing to 0.
        //System.out.println(num/0);

        System.out.println(10/3);
        System.out.println(5 / 2);

        System.out.println(10.0/3.0);
        System.out.println(5.0+2.0);

    }
}
