package day35_Encapsulation.encapsulation;

public class Person {

    private String name;

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

/*
1. Create an Employee Class:
private variables:
name, gender, age, salary
Encapsulate all the private fields
1. Name can not be empty
2. gender can not anything other than
female or male
3. age can not be less than 16, and
greater than 90
4. salary can not be zero or negative

 */