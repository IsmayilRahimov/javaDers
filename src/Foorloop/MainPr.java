package Foorloop;

public class MainPr {
    public static void main(String[] args) {

        boolean isAllowed = false;
        int[] arr = {1, 5, 6};
        try {

            if (!isAllowed) {
                throw new IllegalArgumentException("Gozlenilmez xeta bas verdi:");
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println("Array index out of bounds");

        } finally {
            System.out.println("Array in progress");
        }
    }
}
