package Day_62_Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String>friends = new LinkedList<>();
        //polymorphic way
        List<Integer> scores = new LinkedList();
        scores.add(5);
        scores.add(42);
        scores.add(23);
        scores.add(42);

        System.out.println(scores);
        System.out.println("0= " +scores.get(0));
        System.out.println("1= " +scores.get(1));

        friends.add("Nevzat");
        friends.add("Abbas");
        friends.add("Mahliya");

        friends.addFirst("John");
        System.out.println(friends);
        System.out.println(friends.getLast());


    }
}
