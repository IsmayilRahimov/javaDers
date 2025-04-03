package tasklist;

import java.util.ArrayList;
import java.util.List;

public class ListArray {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
       fruits.add("lemon");
       fruits.add("banana");
       fruits.add("cherry");
       fruits.add("grape");
       fruits.add("apple");
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.getFirst());
        System.out.println(fruits.getLast());
        System.out.println(fruits.remove(2));
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));

    }
}

