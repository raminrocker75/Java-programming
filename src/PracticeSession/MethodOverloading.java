package PracticeSession;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println("methodOverloading.sum(4,5) = " + methodOverloading.sum(4, 5));
        System.out.println("methodOverloading.sum(4,5,6) = " + methodOverloading.sum(4, 5, 6));

    }
    public int sum(int a , int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
}
