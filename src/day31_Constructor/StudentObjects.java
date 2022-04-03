package day31_Constructor;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1=new Student("Aliya",34,'F',123456,'A');
        System.out.println("student1 = " + student1);
        Student student2=new Student("Daniel",30,'M',23456,'B');
        Student student3=new Student("Muhtar",34,'M',98765,'A');

        System.out.println("student3 = " + student3);
        System.out.println("student2 = " + student2);
    }
}
