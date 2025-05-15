package ScannerStringEx;

import java.util.Scanner;

public class ScannerExOp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasinizi bilmek ucun tevelludunuzu daxil edin:");

        int num = scanner.nextInt();
        int age = 2025 - num;
        System.out.println("Yasiniz hal hazirda budur" + age);
    }
}

