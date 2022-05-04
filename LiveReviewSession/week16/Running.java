package week16;

public class Running extends Exercise{




    @Override
    public void perform() {
        System.out.println("Performing running exercise on the Track");
    }

    @Override
    public int getCalories(int minutes) {
        return minutes*13;
    }
}
