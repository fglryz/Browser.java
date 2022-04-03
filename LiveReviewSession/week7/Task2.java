package week7;

public class Task2 {
    public static void main(String[] args) {

        for (int i = 1; i <=6 ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(j%2!=1?0:1);

            }

            System.out.println();
        }

    }
}
/*
1
10
101
1010
10101
101010
 */