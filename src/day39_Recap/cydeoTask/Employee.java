package day39_Recap.cydeoTask;

public class Employee extends Person {
    private String employeeId;
    private String jobTitle;
    private double salary;
    public Employee(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            System.err.println("Invalid salary"+salary);
        }
        this.salary = salary;
    }


    public void work(){
        System.out.println(getName()+" is working");

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
Create a sub class of Person named Employee:
Extra variables:
employeeId, jobTitle, salary
Encapsulate all the fields
Add a constructor to set all the fields
Methods:
work()
toString()
 */