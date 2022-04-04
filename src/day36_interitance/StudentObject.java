package day36_interitance;

public class StudentObject {
    public static void main(String[] args) {
        day36_interitance.Student student1=new Student("Daniel","MIT",2,'G','A');
        student1.setAge(34);
        student1.setGender('M');
        System.out.println(student1);

    }
}
