package day30_CustomClass_Intro;

public class Student {
    public String name;
    public int ID;
    public char gender;
    public int age;
    public char grade;

    public void setInfo(String name, int ID, char gender, int age, char grade) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    public void  code(){
        System.out.println(name+" is coding");
    }
    public void  sleep(){
        System.out.println(name+" is sleeping");
    }


}
