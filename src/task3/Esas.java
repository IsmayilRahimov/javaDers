package task3;

public class Esas {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Elvin");
        person.setSalary(3500);
        System.out.println("Insanin adi :" + person.getName());
        if (person.getSalary() > 0 && person.getSalary() < 5000) {
            System.out.println("Insanin maasi :" + person.getSalary());
        } else {
            System.out.println("Maas dogru deil. 0-dan boyuk olmalidir:");
        }
    }
}
