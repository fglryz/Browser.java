package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee e1=new Employee("Tatiana",'F',27,130000);
        e1.setAge(32);

        Employee e2=new Employee("Aygun",'F',24,110000);
        e2.setName("Hulya");
        e2.setSalary(e2.getSalary()+15000);

        System.out.println(e1);
        System.out.println(e2);


    }
}
