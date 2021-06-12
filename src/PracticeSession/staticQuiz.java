package PracticeSession;

public class staticQuiz {
//    static String name = "John";
//    String id = "123";
//
//    public static void main(String[] args) {
//        System.out.println(name);
//        System.out.println(id+1);
//    }





//     static int inum =10;
//
//    public static void main(String[] args) {
//        staticQuiz obj1 = new staticQuiz();
//        obj1.inum=20;
//        staticQuiz obj2 = new staticQuiz();
//        System.out.println(obj2.inum);
//    }



    static int a ;
    int b;

    public static void main(String[] args) {
        staticQuiz obj1 = new staticQuiz();
        obj1.b=10;
        obj1.a =20;

        staticQuiz obj2 = new staticQuiz();
        obj2.b = 30;
        obj2.a =40;
        System.out.println(obj1.a +" " + obj1.b);
        System.out.println(obj2.a +" " + obj2.b);
    }
}
