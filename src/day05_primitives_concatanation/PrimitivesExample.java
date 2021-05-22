package day05_primitives_concatanation;

public class PrimitivesExample {
    public static void main(String[] args){
//        Whole numbers.
        byte byteValue=127;
        short shortValue=32000;
        int intValue=2123543123;
        long longValue=1321654132136541321l;
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
//        *****Decimal Numbers/FLOATING NUMBER POINT TYPES*****
        float floatValue= 2345.55F;
        double doubleValue=2123121354.13215465; // adding D at the end is also valid but not necessary.
        System.out.println(floatValue);
        System.out.println(doubleValue);
//        ***CHARACTER TYPE****
        char charValue='R'; // **note** only one character or number ONLY ONE! It has to be in single quote.
        System.out.println(charValue);
//        ******BOOLEAN**** - TRUE|FALSE ***** true or false should be in lower case.
        boolean booleanValue= false;
        System.out.println(booleanValue);
    }
}
