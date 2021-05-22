package Day_22_string_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        //             0123
        String word = "java";
        char reverse0 = word.charAt(0);
        char reverse1 = word.charAt(1);
        char reverse2 = word.charAt(2);
        char reverse3= word.charAt(3);
        System.out.println("" + reverse3 + reverse2 + reverse1 + reverse0);

        String word2 = "" + reverse3 + reverse2 + reverse1 + reverse0;

        System.out.println("word2 = " + word2);

        if (word.equalsIgnoreCase(word2)){
            System.out.println("palindrome word");
        }else {
            System.out.println("not palindrome word");
        }
    }
}

