package OfficeHours.Practice_03_08_2021;

public class Casting {
    public static void main(String[] args) {
//        byte -> short -> int -> long -> float -> double
/*
by default whole numbers will be read as int data types
by default decimal numbers will be read as double types
 */
        byte b = 10;
        short s = b; // happens automatically because its smaller to a bigger var
        byte b2 = (byte) s;


        double d = 5.3;
        int i = (short) d;
        int i2 = (int)d;
        System.out.println(i);
        System.out.println((double) i);

        float f = 3.54f;
        float f2 = (float) 3.54;

        float f3 = 5; // float = int->5.0
        float f4 = 5.5f; // float = double

        long l = 22313; // long = int
        long l2 = 32121654551L;
        System.out.println(l);
        System.out.println((double)l);
        System.out.println((float) l);

        double million = 1_000_000;
        System.out.println((int)million);

    }

}
