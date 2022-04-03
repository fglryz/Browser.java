package day31_Constructor.scrumTask;

public class Developer {
    public String name,JobTitle;
    public int employeeID;
    double Salary;

    public Developer(String name, String jobTitle, int employeeID, double salary) {
        this.name = name;
        JobTitle = jobTitle;
        this.employeeID = employeeID;
        Salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", Salary=$" + Salary +
                '}';
    }

    public void coding(){
        System.out.println(name+" is coding");
    }
    public void unitTesting(){
        System.out.println(name+" is testing unit");
    }
    public void fixingBug(){
        System.out.println(name+" is fixing bug");
    }

}
/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary
	          Add A constructor that can set all the fileds
	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */