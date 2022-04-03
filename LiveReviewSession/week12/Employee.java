package week12;

public class Employee {
    public String name,JobTitle;
    public double salary;
    public int ID;

    public Employee(String name, String jobTitle, double salary, int ID) {
        this.name = name;
        JobTitle = jobTitle;
        this.salary = salary;
        this.ID = ID;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", salary=" + salary +
                ", ID=" + ID +
                '}';
    }
}
