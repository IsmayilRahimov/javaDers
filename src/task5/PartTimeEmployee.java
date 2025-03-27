package task5;

public class PartTimeEmployee extends Employee {
    @Override
    public void calculateSalary(){

        setSalary(1800);
        System.out.println("Yarim statli iscinin maasi: " + getSalary());




    }

    @Override
    public void getBenefits(){
        System.out.println(" Yarim statli iscini imtiyazlari : Tibbi sigorta illik bonus.");


    }

    @Override
    public void workDetails(){

        setName("Elvin");
        System.out.println("Yarim statli iscinin adi: " + getName());
        System.out.println("Yarim statli iscinin isi : Freelancer kimi isleyir  " );


    }


}
