package Operators;

public class ElseIfExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        if (a < b) {
            System.out.println("Sertimiz dogrudur:");
        } else {
            System.out.println("Sertimiz dogru deyil:");
        }
        if(a==b){
            System.out.println("Sertimiz dogrudursa:");

        } else if (a!=b) {
            System.out.println("Sertimiz dogrudur:");

        }else {
            System.out.println("Hec bir sert dogru deyil:");
        }

    }
}
