package task5;

public class  FullTimeEmployee extends Employee {



    @Override
    public void calculateSalary(){

        setSalary(3500);
        System.out.println("Tam statli iscinin maasi: " + getSalary());




    }

@Override
    public void getBenefits(){
    System.out.println(" Tam statli iscini imtiyazlari : Tibbi sigorta illik bonus.");


    }

@Override
    public void workDetails(){

    setName("Orxan");
    System.out.println("Tam statli iscinin adi: " + getName());
    System.out.println("Tam statli iscinin isi : Bankda proqramci isleyir  " );


    }




}
