package task5;

public class Main {

    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();

        fullTimeEmployee.workDetails();
        fullTimeEmployee.calculateSalary();
        fullTimeEmployee.getBenefits();
        System.out.println("");

        partTimeEmployee.workDetails();
        partTimeEmployee.calculateSalary();
        partTimeEmployee.getBenefits();


    }


}
