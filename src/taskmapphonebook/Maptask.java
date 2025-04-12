package taskmapphonebook;

import java.sql.SQLData;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maptask {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Elvin", " 099 333 55 66");
        map.put("Musa", " 077 326 55 44");
        map.put("Eli", " 077 256 88 99");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ad daxil edin :");
        String name = scanner.nextLine();


        switch (name){
            case "Elvin":
                System.out.println("Elvinin nomresi :" + map.get("Elvin"));
                break;
            case "Musa":
                System.out.println("Musanin  nomresi :" + map.get("Musa"));
                break;
            case "Eli":
                System.out.println("Elinin  nomresi :" + map.get("Eli"));
                break;
            default:
                System.out.println("Bele bir wexs yoxdur  ");
                break;
        }



    }
}
