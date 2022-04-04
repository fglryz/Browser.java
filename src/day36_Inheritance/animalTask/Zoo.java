package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.setInfo("Max","Hasky",'M',"Small","White",2);
        dog.eat(); dog.drink(); dog.sleep(); dog.move(); dog.move(); dog.bark();

        System.out.println(dog);

        Cat cat=new Cat();
        cat.setInfo("Tarcin","British",'M',"Small","Grey",1);
        cat.eat(); cat.drink(); cat.sleep(); cat.move(); cat.move();cat .scratch();
        System.out.println(cat);

        Tiger tiger=new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'F',"large","Orange",4);
        tiger.eat(); tiger.drink(); tiger.sleep(); tiger.move(); tiger.move();tiger.hunt();tiger.roar();
        System.out.println(tiger);
    }
}
