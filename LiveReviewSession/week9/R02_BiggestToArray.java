package week9;

import java.util.Arrays;

public class R02_BiggestToArray {
    public static void main(String[] args) {
        //find the biggest number in each array and store it to another one dimentional array
        int[][] arr = {{3, 12, 3, 34, 12}, {13, 7, 456, 34, 3}, {-5, -24, -2, -10, -4}};
        //I want to print 2D on console
        System.out.println(Arrays.deepToString(arr));
        int[] biggestNumber = new int[arr.length];//the size of the 2D array

        for (int i = 0; i < arr.length; i++) {
           int max=arr[i][0];//this satatement mean is first
            // elemnt of each elements of each array index i
            for (int each:arr[i]) {
                if(each>max){
                    max=each;
                }

            }
           biggestNumber[i]= max;
        }
        System.out.println(Arrays.toString(biggestNumber));


    }
}
