package day43_Abstraction.Employee;

public final  class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+"is testing");
    }


    @Override
    public void sleep() {
        System.out.println(getName()+" sleep  8 hours in a day");
    }
    public void bugReport(){
        System.out.println(getName()+ " is creating bug reports");
    }
}
/*
Tester
work(): testing
 */