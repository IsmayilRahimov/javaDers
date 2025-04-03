package task55;

import java.util.*;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> name = new LinkedList<>();
        name.add("Eli");
        name.add("Dasqin");
        name.add("Imran");
        name.add("Zohrab");
        name.add("Tural");
        name.add("Anar");
        name.add("Murad");
        name.add("Imran");
        name.add("Niyaz");
        name.add("Ugur");
        System.out.println("Linked list : " + name);

        Set<String>name2 = new HashSet<>(); // burda adlari qarisiq cap etdi ve imran (tekrar elementi) useri 1 e saldi :
        name2.addAll(name);
        System.out.println(name2);

        Set<String>name3 = new  LinkedHashSet<>(); // burda Linked list setindeki kimi adi oldugu sirasiyla saxladi , imran useri 1 e saldi.
        name3.addAll(name);
        System.out.println(name3);

        Set<String> name4 = new TreeSet<>(); // burda bu setde elifba sirasiyla saxladi ve Imran useri 1 e saldi:
        name4.addAll(name);
        System.out.println(name4);






    }
}
