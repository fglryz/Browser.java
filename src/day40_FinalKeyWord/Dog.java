package day40_FinalKeyWord;

public final class Dog extends Animal{

    public Dog(String name, String breed, char gender, String color, String size, String age) {
        super(name, breed, gender, color, size, age);
    }


    @Override
    public void eat() {
        System.out.println(getName()+ "is eating dog food");
    }
    //public void drink() {//final ca
        //System.out.println(getName()+ "is eating dog food");
    public final void bark(){
        System.out.println(getName()+" is barking");
    }
    }






