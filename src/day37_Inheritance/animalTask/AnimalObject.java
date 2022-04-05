package day37_Inheritance.animalTask;

public class AnimalObject {
    public static void main(String[] args) {


        Cat cat1 = new Cat("Leo", "Short Hair", 'M',
                "medium", "Golden Brown", 1);
        cat1.drink();
        cat1.scratch();
        cat1.move();


        System.out.println(cat1);

        Dog dog1 = new Dog("Max", "Hasky", 'F', "Big",
                "White", 2);
        System.out.println(dog1);
        dog1.bark();
        dog1.sleep();

        Parrot parrot1=new Parrot("King","Makaw",'M',"Small","Blue",2,
                "Yellow");
        System.out.println(parrot1);
        parrot1.sing();


    }

}
