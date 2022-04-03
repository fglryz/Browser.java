package day32_Constructor;

public class Employee {
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name) {
        this.name =name;
    }
    public Employee(String name,char gender) {
        //Employee()
        this(name);
        this.gender=gender;
    }

    public Employee(String name,char gender ,String jobTitle) {
        //Employee()
        this(name,gender);
        this.jobTitle=jobTitle;
    }
    public Employee(String name,char gender ,String jobTitle,double salary) {
        //Employee()
        this(name,gender,jobTitle);
        this.salary=salary;
    }




    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}


