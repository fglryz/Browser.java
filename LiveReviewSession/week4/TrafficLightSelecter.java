package week4;

public class TrafficLightSelecter {
    public static void main(String[] args) {

        char color='r';
        switch (color){
            case'R': case'r':
                System.out.println("Red light");
                break;
            case'O': case'o':
                System.out.println("Orange light");
                break;
            case'G': case'g':
                System.out.println("Green light");
                break;
            default:
                System.out.println("Invalid light");

        }
    }
}
