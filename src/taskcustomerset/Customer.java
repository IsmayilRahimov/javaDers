package taskcustomerset;

import java.util.*;

public class Customer {
    public static void main(String[] args) {
        List<String>customer = new LinkedList<>();
      //  List<Integer>custom = new LinkedList<>();
        customer.add("Mustafa Musfiqli 44");
       // custom.add(22);
        customer.add("Eli Aliyev 35");
        customer.add("Zaur Niyazov 20");
        customer.add("Mikayil Rehimov 27 ");
        customer.add("Vusal Eliyev 22");
        customer.add("Eli Aliyev 35");
        System.out.println("Customer : "+customer);


        Set<String>customer2= new HashSet<>();
        customer2.addAll(customer);
        System.out.println("Customer-HashSet : "   +customer2);

        Set<String>customer3 = new LinkedHashSet<>();
        customer3.addAll(customer);
        System.out.println("Customer-LinkedHashSet : "   +customer3);

        Set<String>customer4=new TreeSet<>();
        customer4.addAll(customer);
        System.out.println("Customer-TreeSet : "  +customer4);



    }
}
