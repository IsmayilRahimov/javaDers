package Scannerexwhile;

import java.util.Scanner;

public class ScannertaskExe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ili daxil edin:");
        if (scanner.hasNextInt()) ;
        {

            int year = scanner.nextInt();

            if (year > 0) {
                boolean result = (year % 4 == 0);
                if (result == true) {
                    System.out.println(year + "il fevral ayi 29 gunden ibaretdir:");

                } else {
                    System.out.println(year + "il fevral ayi 28 gunden ibaretdir:");
                }

            } else {
                System.out.println("Il sifirdan boyuk olmalidir:");

            }


        }
            System.out.println("ssa");

        }
    }





