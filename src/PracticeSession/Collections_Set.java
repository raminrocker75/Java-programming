package PracticeSession;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collections_Set {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(1);
        numbers.add(1);

        System.out.println(numbers);// hash set does not take duplicate elements
        System.out.println(numbers.remove(1)); // this will return us the boolean value and if it's true it will remove
        System.out.println(numbers); // if it's not true it won't do anything

        if (numbers.contains(1)){
            numbers.remove(1);
            System.out.println(numbers);
        }else {
            System.out.println(numbers);
        }




        Set<String>set = Set.of("Hello", "world", "1" , "2" , "3");

        Iterator<String>iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("--------------");

        for (String e :
                set) {
            System.out.println(e);
        }

        System.out.println("------------ TreeSet");
        Set<Integer> set1 = new TreeSet<>();
        set1.add(2);
        set1.add(2);
        set1.add(5);
        set1.add(6);
        set1.add(7);
        System.out.println(set1);
                            // Tree set is sorted
        for (int e : set1){
            System.out.println(e);
        }
        System.out.println("--------------");
        Iterator<Integer>s = set1.iterator();
        while (s.hasNext()){
            int adding = s.next();
            System.out.println(adding);

        }
    }

}
