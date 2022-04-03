package day35_Encapsulation;

public class PersonTest {
    public static void main(String[] args) {
        Review_person person1=new Review_person("Metin","English",'M',17);
        Review_person person2=new Review_person("Kerim","French",'M',15);


        person1.printName();
        person1.drink("Cola");
        person1.eat("banana");
        System.out.println(person1.numberOfHead);
        System.out.println(person1.numberOfWing);
        System.out.println(person1.hasNose);
        System.out.println(person1.isHuman);

        System.out.println("person1 = " + person1);
    }
}
