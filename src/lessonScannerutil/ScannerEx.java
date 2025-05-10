package lessonScannerutil;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Heftenin gununu daxil edin: ");
        while (true) {
            if (scanner.hasNextInt()) {



                int day = scanner.nextInt();

                switch (day) {
                    case 1:
                        System.out.println("1 ci gun budur:");
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("2-ci gun budur: ");
                        System.out.println("Wednesday");
                        break;
                    case 3:
                        System.out.println("Heftenin 2 cu gunu budur");
                        System.out.println("Thursday");
                        break;
                    default:
                        System.out.println("bele bir gun teyin edilmiyib:");
                }
            }else {
                System.out.println("Bele bir eded yoxdur ");
                break;
            }
        }
    }
}
