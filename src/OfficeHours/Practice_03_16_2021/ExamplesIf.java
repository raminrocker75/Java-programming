package OfficeHours.Practice_03_16_2021;

public class ExamplesIf {
    public static void main(String[] args) {

        int a = 10;
        int b = a-- * 2 - --a % 2 + a;
        // b = (10 * 2) - (8 % 2) + 8
        // b = 20 - 0 + 8
        //20 - 8 = 12
        System.out.println(b);

    }
}
