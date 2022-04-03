package day32_Constructor;

public class EmploteeObject {
    public static void main(String[] args) {

        Employee employee1=new Employee("FAtma");
        System.out.println(employee1);

    Employee employee2=new Employee("FAtma",'F');
        System.out.println(employee2);
        Employee employee3=new Employee("fatma",'F',"SDET");
        System.out.println(employee3);

}}
