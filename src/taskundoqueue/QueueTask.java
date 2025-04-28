package taskundoqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueTask {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Queue<String> name1 = new LinkedList<>();
        for (int i=0; i<100; i++){
            System.out.println("Adinizi qeyd edin : ");
            String name = scanner.nextLine();
            switch (name){
                case "next":
                    name1.poll();
                    System.out.println(name1);
                break;
                default:
                    name1.add(name);
                    System.out.println(name1);


            }
        }
    }
}
