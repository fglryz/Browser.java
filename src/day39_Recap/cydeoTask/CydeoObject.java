package day39_Recap.cydeoTask;

public class CydeoObject {
    public static void main(String[] args) {
        Developer developer = new Developer("Korkmaz", 29, 'M', "13456", "Java Developer", 125000);

        Tester tester = new Tester("Olga", 27, 'F', "25678", "SDET", 110000);

        Teacher teacher = new Teacher("Daniel", 32, 'M', "3432", "Math Teacher", 100000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET" );


        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);
        System.out.println("+===================================");

        developer.setAge(39);
        System.out.println(developer.getAge());
        System.out.println("----------------------------------------");

        developer.work();
        teacher.work();
        tester.work();
        student.study();



    }
}
/*
Create a class named Cydeo:
create objects of Tester, Developer,Teacher, Student
test all the functions of each objects
Analyze the relationships between the classes
 */