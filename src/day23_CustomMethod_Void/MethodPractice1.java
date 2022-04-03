package day23_CustomMethod_Void;

public class MethodPractice1 {
    public static void main(String[] args) {

        helloWorld5Times();
        System.out.println("-------------------------");
        helloCydeo5Times();
        System.out.println("--------------------------");
        evenNumber();
    }

    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello Word");

        }


    }

    public static void helloCydeo5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");

        }
    }

    public static void evenNumber() {

        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);


        }
    }

}
