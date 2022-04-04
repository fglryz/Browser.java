package day36_interitance;

public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student("Daniel",
                "MIT",2,'E','G');
        student1.setAge(39);

        System.out.println(student1);
    }
}
