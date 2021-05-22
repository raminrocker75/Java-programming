package Day07_arithmatic_operators_casting;

public class StringConcat {
    public static void main(String[] args) {
        System.out.println("java" + 5 + 3);//java53
        System.out.println("java" + (5 + 3)); //java8 why? because of paranthesis.
        System.out.println(5+3+"java");//8java
        System.out.println(5+(3+"java"));//53 java because of parenthesis.
        System.out.println("hello" + 1+2+3);// hello123 double quote is string so it'll treat everything like string unless we have parenthesis around what we want calculated.
        System.out.println("hello " +(1+2+3));// hello 6.

        String str1="hello";
        String str2="friends";
        System.out.println(str1 + str2);
        System.out.println(str1 + " " +str2);

        int num1= 7;
        int num2= 8;
        System.out.println(num1+num2);//15
        System.out.println(num1+ " " + num2);//7 8 because of the string in the middle with a space.
        System.out.println(num1+""+num2);

        char char1='a';
        char char2='b';
        System.out.println(char1+char2); // when we plus between chars, it will add numbers from ascii table. in this case char1 is 97 and char b is 98.

        System.out.println(char1 + "" + char2); // ab cause were using string concatenation.
    }
}
