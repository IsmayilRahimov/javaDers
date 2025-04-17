package lessontaskIoExample;

import java.io.*;
import java.util.Scanner;

public class IoExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad ve soyad  daxil edin:");
        String name = scanner.nextLine();
        System.out.println("Sizin adiniz: " + name);

        try {
            FileWriter writer = new FileWriter("users.txt");
            writer.write(name);
            System.out.println("Qeyd olunan ad ve soyad:" + name);
//            writer.write("Adlar budur "+name);
            writer.close();
//            writer.close();


        } catch (IOException e) {
            System.out.println("Fayla adlar duzgun daxil edilmeyib: " + e.getMessage());


        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
            String text = reader.readLine();
            while (text !=null ){

                System.out.println(text);
                break;
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Xeta: " + e.getMessage ());


        }


    }
}
