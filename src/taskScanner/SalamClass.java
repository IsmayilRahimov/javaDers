package taskScanner;

import java.util.Scanner;

public class SalamClass {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad daxil edin");
        String name = scanner.nextLine();
        switch (name){
            case "Elvin":
                System.out.println("Sizin adiniz qeyd olundu: " +name);
                break;
            default:
                System.out.println("Bele bir wexs yoxdur: ");

        }
    }
}
