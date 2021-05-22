package Day_21_String_Manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.contains("b"));
        System.out.println(word.replace("hub","lab"));
        System.out.println("word= " + word);

        word = word.replace("hub", "lab");   // reassigning with the new letter replacements
        System.out.println("word= " + word);

         System.out.println(word.replace("i","o"). replace("a" , "i")); // gitlib we have now.


        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" ","");
        System.out.println("with no space= " + withNoSpaces);
        sentence = sentence.replace("java", "selenium").replace("fun" , "a lot of fun");
        System.out.println(sentence);

        String result = "1-48 of over 4,000 results for java book";
        result=result.replace("1-48 of over","")
                .replace(",","")
                .replace("results for java book","");
        System.out.println("result = " + result);

    }
}
