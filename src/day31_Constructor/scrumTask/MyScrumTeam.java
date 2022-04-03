package day31_Constructor.scrumTask;

import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {
        //4 testers object,//
        Tester tester1 = new Tester("Layan", "QA", 11, 110000);
        Tester tester2 = new Tester("Ali", "SDET", 43, 142000);
        Tester tester3 = new Tester("Alex", "SE", 44, 135000);
        Tester tester4 = new Tester("Lala", "SDET", 40, 115000);
        Tester[] testers = {tester1, tester2, tester3, tester4};
        // 4 developer object,
        Developer dev1 = new Developer("Olga", "Java Developer", 32, 125000);
        Developer dev2 = new Developer("Aygun", "Java Master", 02, 185000);

        Developer dev3 = new Developer("Tunc", "Software Developer", 12, 135000);

        Developer dev4 = new Developer("Rayan", "Senior Developer", 22, 200000);
        Developer[] developers = {dev1, dev2, dev3, dev4};

//1 scrumteam object
        ScrumTeam scrum = new ScrumTeam("Nigara", "Huseyin", "Neira", 14);
        scrum.addTesters(testers);
        scrum.addDevelopers(developers);
        System.out.println(scrum);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        for (Tester eachTester:scrum.testersList) {
            System.out.println(eachTester.name + ":" + eachTester.salary);
        }
        System.out.println("----------------------------------------");
            for (Developer eachDeveloper:scrum.devopsList) {
                System.out.println(eachDeveloper.name+":"+ eachDeveloper.Salary);
        }
        System.out.println("--------------------");
            scrum.removeTester(43);
            scrum.removeDeveloper(02);
        System.out.println(scrum);
        }


    }

