package taskarraylist;

import java.util.Scanner;

public class Taskuser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivi daxil et :");
        String name =scanner.nextLine();
        System.out.println("Yawivi daxil et :");
        int age = scanner.nextInt();
        System.out.println("Gozel insan sizin adiniz budur "+ name +  ":  Allah uzun omur versin .Yawin budur: " + age);
//        scanner.nextInt();
    }
}
