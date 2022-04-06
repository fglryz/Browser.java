package day37_Inheritance.scrumTeam;

public class ProoductOwner extends Employee{
    public ProoductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);
    }
    public void gettingRequirements(){
        System.out.println(name+ " is gathering requirements from client");
    }

}
