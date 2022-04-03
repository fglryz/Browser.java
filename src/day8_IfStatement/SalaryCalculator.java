package day8_IfStatement;

public class SalaryCalculator {
    public static void main(String[] args) {
int hourlyRate=65;
int weeklyHours=40;

double stateTaxRate=0;
double federalTaxRate=26.2;
//-----------------------------------
        int salaryBeforeTax=hourlyRate*weeklyHours*52;//salary is equalto one week' salary *52
        double stateTax=salaryBeforeTax*stateTaxRate/100;
        double federalTax=salaryBeforeTax*federalTaxRate/100;
        double totalTax=stateTax+federalTax;
        double salaryAfterTax=salaryBeforeTax-totalTax;
//--------------------------------------------------------
        System.out.println("Gross pay is:$ "+salaryBeforeTax);
        System.out.println("stateTax = $" + stateTax);
        System.out.println("federalTax = $" + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("Net income is:$"+salaryAfterTax);


    }
}


 /*
reate a class called SalaryCalculator.java
        3.1 declare the following variables:
        hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
        3.2 use the given info in above variables to calculate the followings:
        1. salaryBeforeTax
        2. stateTax
        3. federalTax
        4. totalTax
        5. salaryAfterTax
        Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52
        3.3 use print statement to print each of the above
        Ex:
        hourlyRate = $50
        weeklyHours = 45
        stateTax = 6 (given as percentage, you need to convert to decimal)
        federalTax = 26 (given as percentage, you need to convert to decimal)
        output:
        Gross pay is: $117000
        Federal tax is: $30420
        State tax is: $7020
        Total tax is: $37440
        Net income is: 79560
        */




