package week9;

import java.util.Arrays;

public class R01_ArrayBinary {
    public static void main(String[] args) {

        int [] nums={ -5,23,123,654,2344,12345};

        int indexOne= Arrays.binarySearch(nums,23);
        System.out.println("indexOne = " + indexOne);
        System.out.println(Arrays.binarySearch(nums,2344));
        System.out.println(Arrays.binarySearch(nums,25));

        if(Arrays.binarySearch(nums,12345)>0){
            System.out.println("12345 is present in array");

        }
        else{
            System.out.println("Not in the list");
        }
    }
}
