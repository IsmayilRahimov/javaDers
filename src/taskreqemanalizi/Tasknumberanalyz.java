package taskreqemanalizi;

import java.util.*;

public class Tasknumberanalyz {
    public static void main(String[] args) {
        Set<Integer> number = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("5 eded daxil edin:");

        while (number.size() < 5) {
            System.out.print("Eded:" );
            int eded = scanner.nextInt();
            number.add(eded);

        }
        int cem = 0;
        for(int eded : number){ // number setinde her elementi ardiciliq olaraq int edede beraber edir.
            cem += eded; // cem = cem + eded

        }
        double ortalama =  (double) cem/5;
        int maximum = ((TreeSet<Integer>) number).last();
        System.out.println("Ortalama budur " + ortalama);
        System.out.println("Maximum budur" + maximum);



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Reqemleri daxil edin:");
//        scanner.nextInt();
//        List<Integer>number = new ArrayList<>();
//        number.add(1);
//        number.add(2);
//        number.add(3);
//        number.add(4);
//        number.add(5);
//        System.out.println(number.size());
//        System.out.println(number.getLast());
//
//        System.out.println("Butun ededlerin cemi : " +(1+2+3+4+5));
//        System.out.println("Butun reqemlerin ortalamasi :"+(1+2+3+4+5)/5);
//


    }

}
