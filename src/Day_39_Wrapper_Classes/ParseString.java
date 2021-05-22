package Day_39_Wrapper_Classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println(count);

        String total1 = "123.25";
        double count1 = Double.parseDouble(total1);
        if(count1>100) {
            System.out.println("expensive");
        }
        String total3 = "6543F";
        float  count3 = Float.parseFloat(total3);
        System.out.println(count3);

        String total4 = "4654321";
        long count4 = Long.parseLong(total4);
        System.out.println(count4);

        String sentence = "I wrote 100 lines of code";
        String[] words = sentence.split(" ");
        int number = Integer.parseInt(words[2]);
        System.out.println(number);

    }
}
