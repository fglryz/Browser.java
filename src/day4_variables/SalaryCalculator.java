package day4_variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourly,weeklyhours


        int hourlyRate=50;
        int weeklyHours=40;
        int numberOfWeek=52;

        int salary=hourlyRate*weeklyHours*numberOfWeek;
       // System.out.println("salary:"+salary);
        System.out.println("salary = $" + salary);
        System.out.println("weeklyHours = $" + weeklyHours);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("numberOfWeek = " + numberOfWeek);
        
        
    }
}
