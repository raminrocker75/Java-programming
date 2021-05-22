package Day_16_switch_ternary;

public class switchCheckNumbers {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        switch(num1) {
            case 10:
                num1++;
                num2 += 10;
                break;
            case 20:                            // case 20 is missing the break so it'll count from there to bottom.
                num1 += num2;
                num2--;
            case 30:
                num1 = 0;
                num2 -= 3;
                break;
        }
        System.out.println(num1);
        System.out.println(num2);
    }
}
