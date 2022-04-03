package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers =  {1,2,3,4,7,9,11,};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; ++i) {
            if (max < numbers[i]) max = numbers[i];
        }


      /*  for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.nout.println(max);*/
        for (int number : numbers) {
            if(number>max){
            max = number;

        }

    }
        System.out.println(max);


    }


    }

