package task2;

public class Main {
    public static void main(String[] args) {
        Car car =  new Car();
        car.setBrand(" Mersedes ");
       // car.getBrand();
        car.setSpeed(150);
        System.out.println(" Masinin markasi :" + car.getBrand());
        if(car.getSpeed() > 0 && car.getSpeed() < 300 ){
            System.out.println("Masinin sureti :"+ car.getSpeed());}
        else {
            System.out.println("Suret duzgun deyil! 0 ile 300 arasinda olmalidir: ");

        }


    }
}
