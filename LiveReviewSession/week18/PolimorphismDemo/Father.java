package week18.PolimorphismDemo;

public class Father extends Parent implements  Worker{
    @Override
    public void raiseKid() {
        System.out.println("Raising kids");

    }

    @Override
    public void playWithKid() {
        System.out.println("playing kids occasionally");

    }

    @Override
    public void feedKid() {
        System.out.println("Feeding kids always");

    }

    @Override
    public void work(String job) {
        System.out.println("Working as "+job);


    }

    @Override
    public double getPaid() {
        return 111000.0;
    }
}
