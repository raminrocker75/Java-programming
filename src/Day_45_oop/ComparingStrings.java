package Day_45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String name = "java";
        String name1= name;
        System.out.println(name==name1);
        String name2 = new String("java");
        System.out.println(name2==name);


        String word1 = "hava";// create in string pool
        String word2 = "hava";// re-use from string pool
        String word3 = new String("hava"); // create in HEAP, outside String pool
        String word4 = new String("hava");
        System.out.println(word1==word2); //TRUE -> point to same object in pool
        System.out.println(word1==word3); // FAlSE -> point to different object in HEAP and POOL
        System.out.println(word3==word4); // FALSE -> point to different objects in HEAP

        System.out.println(word1.equals(word2));// TRUE - comparing values
        System.out.println(word1.equals(word3));// TRUE - comparing values
        System.out.println(word1.equals(word4));// TRUE - comparing values
    }
}
