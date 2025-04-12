package task09;

import java.util.ArrayList;
import java.util.List;

public class Customer2 {
    public static void main(String[] args) {
        List<String> person = new ArrayList<>();
        person.add("Vusal");
        person.add("Memmedov");
        person.add("28");


        List<String> person2 = new ArrayList<>();
        person2.add("ELi");
        person2.add("Eliyev");
        person2.add("22");


        List<List<String>> human = new ArrayList<>();
        human.add(person);
        human.add(person2);
        System.out.println(human);

    }
}
