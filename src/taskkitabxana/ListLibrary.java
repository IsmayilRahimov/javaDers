package taskkitabxana;

import java.util.*;

public class ListLibrary {
    public static void main(String[] args) {
        List<String> library = new ArrayList<>();
        library.add("Book r");
        library.add("Book a");
        library.add("Book z");
        library.add("Book a");
       // System.out.println(library);
        Set<String> library1 = new HashSet<>(library);
        System.out.println(library1);

        Map<String,String> library2 = new HashMap<>();
        library2.put("Book r","Poema");
        library2.put("Book a","Eser");
        library2.put("Book z", "Weir");
        System.out.println(library2);


//        System.out.println(library);
//        Map<String,String> library1 = new HashMap<>();



    }
}







