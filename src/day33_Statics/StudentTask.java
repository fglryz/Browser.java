package day33_Statics;

import java.util.Arrays;

class StudentClass{
    public String name;
    public int age,studentID;
    public char gender,grade;

    public StudentClass(String name) {
        this.name = name;
    }

    public StudentClass(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public StudentClass(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }

    public StudentClass(String name, int studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }

    public StudentClass(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

    public StudentClass(String name, char gender, int age, int studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }

    public StudentClass(String name, char gender, int age, int studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentID=" + studentID +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }

}
class test{
    public static void main(String[] args) {


        StudentClass student1 = new StudentClass("Ahmet");

        StudentClass student2 = new StudentClass("Aygun", 'F');

        StudentClass student3 = new StudentClass("Nigara", 11);

        StudentClass student4 = new StudentClass("Mert", 12, 'A');

        StudentClass student5 = new StudentClass("Cihad", 'M', 28);

        StudentClass student6 = new StudentClass("Suhaib", 'M', 27, 15);

        StudentClass student7= new StudentClass("Ali",'M',42,30,'A');


        System.out.println(student1 == student2);


        StudentClass[] students = { student1, student2, student3, student4, student5, student6, student7};


        System.out.println(Arrays.toString(students) );
    }

}
