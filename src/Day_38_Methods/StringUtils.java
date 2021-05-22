package Day_38_Methods;

import java.util.Locale;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullorEmpty(\"hello\") = " + isNullOrEmpty("hello"));
        String word = null;
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
    }

    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String str){
        boolean isPalindrome = false;
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1 - i)){
                return false;
            }
        }

        return true;
    }

    public static String reverse(String str){
        String reverseStr = "";
        for (int i = str.length()-1 ; i >= 0 ; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }
}
