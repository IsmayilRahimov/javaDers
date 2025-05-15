package Operators;

import java.util.Scanner;

public class ScannerUTex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasinizi bilmek isdeyirsinizse tevelludunuzu daxil edin: ");
        int userinelaveedeceyiil = scanner.nextInt();
        int userintevelludu = 2025 - userinelaveedeceyiil;
        System.out.println("Sizin yasiniz budur :" + userintevelludu);


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Fikir bildirin: ");
        String userinfikri = scanner1.nextLine();
        System.out.println("Sizin fikriniz budur." + userinfikri + ": Tesekkurler .");


    }
}
