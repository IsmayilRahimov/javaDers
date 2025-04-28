package taskarraylist;

import java.util.Arrays;
import java.util.Scanner;

public class arrayexample {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int[] number = new int[5];

        int cem = 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Ededi daxil et:");

            number[i] = scanner.nextInt();
            cem += number[i];


        }
        System.out.println(cem);
    }
}