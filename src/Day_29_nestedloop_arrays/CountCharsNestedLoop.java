package Day_29_nestedloop_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {
        String word = "java";

        for (int outter = 0; outter < word.length(); outter++) {
            System.out.println(word.charAt(outter));
            int count = 0;
            for (int inner = 0; inner < word.length(); inner++) {
                //System.out.print(word.charAt(inner));
                if(word.charAt(outter)== word.charAt(inner)){
                    count++;
                }
            }
            System.out.println(word.charAt(outter) + "= " + count);
        }
    }
}
