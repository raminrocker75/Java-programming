package Day_28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        Random random = new Random();
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234567891_??@##@$Q#%#$%^%^";
        String password = "";

        for (int i = 1; i < 8; i++) {
            int index = random.nextInt(80);
            System.out.print(source.charAt(index));
            password += source.charAt(index);
        }
        System.out.println();
        System.out.println("Your password = " + password);
    }


}
