package Scannerexwhile;

import java.util.Scanner;

public class ExScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Heftenin gununu daxil edin: ");
        while (true) {
            if (scanner.hasNextInt()) {
                int day = scanner.nextInt();

                switch (day) {
                    case 1:
                        System.out.println("1-ci gun proqrama baslangic gunudur:");
                        break;
                    case 2:
                        System.out.println("2-ci gun tekrar edirik dersleri:");
                        break;
                    case 3:
                        System.out.println("3 cu gun qacmaga gedirik idman edek:");
                        break;
                    case 4:
                        System.out.println("4-cu gun wehere cixiriq:");
                        break;
                    case 5:
                        System.out.println("Proqram uzerinde isleyirik:");
                        break;
                    case 6:
                        System.out.println("6 cu gun park teserrufat gunudur:");
                        break;
                    case 7:
                        System.out.println("Bazar gunu istirahet gunudur:");
                        break;

                }
            } else {
                System.out.println("Zehmet olmasa eded daxil edin:");
                break;

            }
        }
    }
}
