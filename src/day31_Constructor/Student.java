package day31_Constructor;

public class Student {
    public String  name;
    public int age;
    public char gender;
    public int id;
    public char grade;

    public Student(String name, int age, char gender, int id, char grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }
}

