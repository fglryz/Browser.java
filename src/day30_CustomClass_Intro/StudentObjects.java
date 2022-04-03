package day30_CustomClass_Intro;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Anatolia", 1234, 'F', 15, 'A');
        System.out.println("student1 = " + student1);

        Student student2 = new Student();
        student2.setInfo("Metin",2346,'M',16,'A');
        System.out.println("student2 = " + student2);


        Student student3 = new Student();
        student3.setInfo("Alina",23465,'F',29,'B');
        System.out.println("student3 = " + student3);

        Student student4 = new Student();
        student4.setInfo("Jack",1123465,'M',29,'B');
        System.out.println("student4 = " + student4);

        Student student5 = new Student();
        student5.setInfo("Lucy",1123465,'F',39,'B');
        System.out.println("student5 = " + student5);

        System.out.println("------------------------------");
        Student[] students={student1,student2,student3,student4,student5};
        for (Student student : students) {
            System.out.println(student);

        }
        System.out.println("______________________________________________");

        ArrayList<Student>earlyBirds=new ArrayList<>();//grade:A
        ArrayList<Student>AngryBirds=new ArrayList<>();
        for (Student student : students) {
            if(student.grade=='A'){
                earlyBirds.add(student);
            }
            else{
                AngryBirds.add(student);
            }

        }
        System.out.println("AngryBirds = " + AngryBirds);
        System.out.println("earlyBirds = " + earlyBirds);

    }

}
