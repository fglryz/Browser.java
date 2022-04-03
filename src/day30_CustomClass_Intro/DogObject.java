package day30_CustomClass_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.size = "Small";
        dog1.color = "White";
        dog1.age = 5;
        dog1.gender = 'F';


        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.size = "Large";
        dog2.color = "White&Black";
        dog2.age = 3;
        dog2.gender = 'M';

        Dog dog3 = new Dog();
        dog3.setInfo("Jack",
                "German Shepard", "Small",
                "Brown", '4', 'M');

        System.out.println("dog1= " + dog1);
        System.out.println("dog2= " + dog2);
        System.out.println("dog3= " + dog3);

        dog1.eat();
        dog2.bark();
        Dog dog4 = new Dog();
        dog4.setInfo("Darius", "Rottweiler", "Large", "Black&Brown",
                '3', 'M');
        System.out.println("do4 = " + dog4);

        Dog dog5 = new Dog();
        dog5.setInfo("Leo", "French Terrier", "Small", "White", 5, 'F');

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};
        for (Dog dog : dogs) {
            System.out.println("dog = " + dog);

        }


    ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();
        for (Dog each : dogs) {
            if(each.gender=='F'){
                femaleDogs.add(each);
            }
            else{
                maleDogs.add(each);
            }


        }

        System.out.println("maleDogs = " + maleDogs);
        System.out.println("femaleDogs = " + femaleDogs);



}

    }


