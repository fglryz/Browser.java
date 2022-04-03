package day20_Array;

public class MinimumNumber_7 {
    public static void main(String[] args) {
        int[] numbers = {100, 500, 30, 600, 80, -90};
        int min = numbers[0];//100

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }

        }
        System.out.println(min);
    }
}
