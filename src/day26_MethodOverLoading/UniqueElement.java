package day26_MethodOverLoading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElement {
    public static void main(String[] args) {

        int[] arr={1,2,2,2,3,3,4,5,6,};
        int[] unique=uniqueElement(arr);
        System.out.println(Arrays.toString(unique));

    }

    public static int[] uniqueElement(int[]array) {
        int[] result = {};
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;

    }
}
