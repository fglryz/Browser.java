package day30_CustomClass_Intro;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Micheal", 12345, 'M', 100000, "SDET", true);

        Employee employee2 = new Employee();
        employee2.setInfo("Helena", 12386, 'M', 140000, "Doctor", true);

        Employee employee3 = new Employee();
        employee3.setInfo("Nihal", 987765, 'F', 120000, "PO", true);

        Employee employee4 = new Employee();
        employee4.setInfo("James", 13475, 'M', 90000, "CEO", false);

        Employee employee5 = new Employee();
        employee5.setInfo("James", 13475, 'f', 45000, "Accountant", true);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        int countFullTime = 0;
        int countpartTime = 0;
        double max=employees[0].salary;
        double min =employees[0].salary;
        for (Employee employee : employees) {
            if (employee.isFullTime) {
                countFullTime++;

            } else {
                countpartTime++;
            }
            if(employee.salary>max){
                max=employee.salary;
            }
            if(employee.salary<min){
                min=employee.salary;
            }
        }
        System.out.println("countpartTime = " + countpartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}