package tasklinkedlist2;

import java.util.LinkedList;
import java.util.Scanner;

public class TaskLinked {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> name1 = new LinkedList<>();
        for (int i = 0; i < 3; i++) {

            System.out.println(" Ad daxil edin : ");
            String name = scanner.nextLine();
//            name.toUpperCase();
            name1.add(name.toUpperCase());

        }
        System.out.println(name1);

    }

}

