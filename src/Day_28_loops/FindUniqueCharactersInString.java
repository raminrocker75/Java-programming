package Day_28_loops;

public class FindUniqueCharactersInString {
    public static void main(String[] args) {
        String word = "Javva";
        String unique = "";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
            if (!unique.contains(word.charAt(i)+"")){
                unique+= word.charAt(i);
            }
        }
        System.out.println();
        System.out.println(unique);

    }
}
