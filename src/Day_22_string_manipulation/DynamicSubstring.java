package Day_22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13));
        System.out.println(result.indexOf("12345"));
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));


        System.out.println(result.substring(result.indexOf(":")+1));


        String today = "i learned [orange cat] today";
//        int result1 = today.indexOf("[");
//
//        System.out.println(today.indexOf("["));
//
        int start = today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(today.substring(start+1, end));


    }
}
