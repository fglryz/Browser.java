package week18.PolimorphismDemo;

public class SuperManTest {
    public static void main(String[] args) {
       //polymorphism
        //interface /parent class reference name=child class
        Parent superman1= new Father();//you can reach parent abstract class method but you can not reach worker interface methods
        superman1.feedKid();
        superman1.playWithKid();
        superman1.raiseKid();


     Worker superman2= new Father();
     superman2.getPaid();
     superman2.work("SDET");

     Father superman3=new Father();
     superman3 .feedKid();
     superman3.raiseKid();
     superman3.work("SDET");
     superman3.getPaid();
     superman3.playWithKid();
     boolean b1=superman1 instanceof Worker;
     boolean b2=superman2 instanceof Parent;
     boolean b3=superman3 instanceof Father;
        System.out.println("b3 = " + b3);
        System.out.println("b2 = " + b2);
        System.out.println("b1 = " + b1);
//explicit casting example
        ((Worker)superman1).work("QA");
        ((Worker)superman1).getPaid();
        ((Parent)superman2).raiseKid();
        ((Parent)superman2).playWithKid();
        ((Parent)superman2).feedKid();


    }

}
