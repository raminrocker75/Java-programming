package Day_38_Methods;

import static Day_38_Methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)) {
            System.out.println("Fail: Username cannot be null or empty");
        }


        System.out.println("isPalindrome(Civic) = " + StringUtils.isPalindrome("Civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("Kayak"));
        System.out.println("isPalindrome(Cybertek) = " + StringUtils.isPalindrome("Cybertek"));

        String word = "java";
       String revWord = StringUtils.reverse(word);
        System.out.println("revWord = " + revWord);


    }


}
