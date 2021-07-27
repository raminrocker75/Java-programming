package Day_63_Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        queue.add("one");
//        queue.add("two");
//        queue.add("three");
//        queue.add("four");
//        queue.add("five");

        System.out.println(queue.element());
        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue.poll());

        System.out.println(queue);

    }
}
