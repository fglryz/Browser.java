package day29_ArrayList_CollectionUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElementsInterview {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 5, 5));

        System.out.println("numbers = " + numbers);

        for (Integer each : numbers) {
            int frequency = 0;

            for (Integer element : numbers) {
                if (element == each) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println("each = " + each);
                break;
            }
        }
        {


        }


    }}
