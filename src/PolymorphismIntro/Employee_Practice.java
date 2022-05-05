package PolymorphismIntro;


import day37_Inheritance.scrumTeam.ScrumMaster;
import day43_Abstraction.Employee.Developer;
import day43_Abstraction.Employee.Employee;
import day43_Abstraction.Employee.Tester;

import java.util.ArrayList;
import java.util.List;

public class Employee_Practice {
    public static void main(String[] args) {
        Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        };

        System.out.println("---------------------------------");



                //2.1 store all the developers & testers into the following List of employees
                List<Employee> scrumMembers = new ArrayList<>();
                // 2.2 store all the testers into the following List of testers:
                List<Tester> testers = new ArrayList<>();

                //2.3 store all the developers into the following List of developers:
                List<Developer> developers = new ArrayList<>();
                System.out.println("developers = " + developers);


                for (Employee eachEmployee : employees) {
                    if (eachEmployee instanceof Tester) {
                        testers.add((Tester) eachEmployee);
                    }
                    if (eachEmployee instanceof Developer) {
                        developers.add((Developer) eachEmployee);
                    }

                    System.out.println("developers = " + developers);
                    System.out.println("testers = " + testers);
                    System.out.println("scrumMembers = " + scrumMembers);

                }

//2.4 which tester has the maximum salary?
                double maxSalary = 0;
                for (Tester eachTester : testers) {
                    if (eachTester.getSalary() >= maxSalary) {
                        maxSalary = eachTester.getSalary();
                    }
                }
                for (Tester eachTester : testers) {
                    if (eachTester.getSalary() == maxSalary) {
                        System.out.println("Tester's maxSalary = " + maxSalary);
                    }
                }
               // 2.5 which developer has the maximum salary?
                for (Developer eachDeveloper : developers) {
                    if (eachDeveloper.getSalary() >= maxSalary) {
                        maxSalary = eachDeveloper.getSalary();
                    }
                }
                for (Developer eachDeveloper : developers) {
                    if (eachDeveloper.getSalary() == maxSalary) {
                        System.out.println("Developer's maxSalary = " + maxSalary);
                    }
                }

            }}






