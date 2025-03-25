package task;
public class  Main {


    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Orxan");
        student.setAge(25);

        if(student.getAge() > 0 && student.getAge() < 150){
            System.out.println("Telebenin adi: " + student.getName());
            System.out.println("Telebenin yasi: " + student.getAge());
        } else {
            System.out.println("Telebenin yasi dogru deyil");
        }







    }
}