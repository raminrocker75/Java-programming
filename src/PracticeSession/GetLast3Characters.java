package PracticeSession;

public class GetLast3Characters {
    public static void main(String[] args) {
        String word = "lo";
        if (word.length()<3){
            System.out.println("input should be at least 3 characters");
            return;
        }
        System.out.println(lastThree(word));
    }
    public static String lastThree(String word){
        String sentence = "";
        sentence = word.substring(word.length()-3);
        return sentence;
    }
}
