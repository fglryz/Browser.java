package day30_CustomClass_Intro;

public class Dog {
    public String name;
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    public void setInfo(String dogName,String dogBreed,
                        String dogSize,String dogColor,
                        int dogAge,char dogGender){
        name=dogName;
        breed=dogBreed;
        size=dogSize;
        color=dogColor;
        age=dogAge;
        gender=dogGender;
    }


    public void eat(){
        System.out.println(name+" is eating");

    }
    public void play(){
        System.out.println(name+" is playing");

    }
    public void bark(){
        System.out.println(name+" is barking");

    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Attributes:
name,age,gender,breed,size,colour


Action:

eat(),play(),bark()
 */