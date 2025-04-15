package taskexception;

import java.util.Scanner;

public class ArithmeticExceptionEx {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("1-ci ededi daxil edin:");
        int a = scanner.nextInt();
        System.out.println("2-ci ededi daxil edin: ");
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("0 -a bolmek olmaz");

        }
    }


}

//        int a =
//        int number = scanner.nextInt();
//        int a=10;
//        int b=5;
//        int result =10 / 2;
/// /        int number2 = scanner.nextInt();
//        switch (number) {
//            case 10:

//                System.out.println("Novbeti ededi daxil edin:");
//                System.out.println(" ");
//                break;
//        }

//        }switch (number2 ){
//            case 10:
//                System.out.println("Edediniz budur:  "+ number2 );
//                break;
//        }


//        int a = 5;
//        int b = 4;
//        scanner.nextLine();
//        int number = scanner.nextLine();
//
//    }
//}
