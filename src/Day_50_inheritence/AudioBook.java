package Day_50_inheritence;

public class AudioBook extends Book {
    double length;
    String narrator;

    public void listen(){
        System.out.println("listening to Audio book");
        System.out.println("Title: " + title);
        System.out.println("price : " + price);
        System.out.println("Size : " + length);

    }
}
