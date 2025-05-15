package taskUserEx;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UserTask {
    public static void main(String[] args) {
        Set<Integer> number = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("5 eded daxil edin :");
        while (number.size() < 5) {
            System.out.print("Eded:");
            int eded = scanner.nextInt();
            number.add(eded);

        }
        int cemi = 0;
        for (int eded : number) {
            cemi += eded;
        }
        double ortalamasi = (double) cemi / 5;
        int enboyuyu = ((TreeSet<Integer>) number).last();
        System.out.println("Ortalamasi budur" + ortalamasi);
        System.out.println("En boyuyu budur" + enboyuyu);

    }
}

