package day31_Constructor.scrumTask;

public class Tester {
    public String name,jobTitle;
    public int employeeID;
    double salary;

    public Tester(String name, String jobTitle, int employeeID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public Tester(String name, String jobTitle, int employeeID, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;


    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=$" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println( name+" is smoke testing");

    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");

    }
    public void dailyStandUp(){
        System.out.println(name+" participate the daily standup meting");

    }



}
/*
/*
create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary
	        Add A constructor that can set all the fields
	        Actions:
	           smokeTesting(),  creatingTicket(),  toString()
 */
