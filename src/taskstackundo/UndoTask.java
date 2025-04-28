package taskstackundo;

import java.util.Scanner;
import java.util.Stack;

public class UndoTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> name1 = new Stack<>();
        for (int i = 0; i < 100; i++) {
        System.out.println("Bir soz daxil edin : ");
        String name = scanner.nextLine();

        switch (name){
            case "salam":
                name1.pop();
                System.out.println(name1);
                break;
            default:
                name1.push(name);
                System.out.println(name1);



        }


        }

    }
}
