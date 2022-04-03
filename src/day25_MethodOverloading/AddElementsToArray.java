package day25_MethodOverloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
      int[] arr ={1,2,3,4};
     arr= addInteger(arr,5);
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------");
      double [] arr2={1.2,3.7,34.7,6.1};
        arr2=addDouble(arr2,7.8);
        System.out.println(Arrays.toString(arr2));
        System.out.println("--------------------------");
      String [] names={"Tatiana","Ali","Metin","Kerim"} ;
        names=addString(names,"Nizamettin");
        System.out.println(Arrays.toString(names));
        System.out.println("-----------------------");
        char[] arr4={'A','Z','B','Y'};
        arr4=addChar(arr4,'C');
        System.out.println(Arrays.toString(arr4));
    }


    public static int[] addInteger(int[] array,int element){
        int[] result=new int[array.length+1];
        int i=0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i]=element;
        return result;

    }
    public static double[] addDouble(double[] array,double element){
        double[] result=new double[array.length+1];

        int i=0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i]=element;
        return result;

    }

    public static String[] addString(String[] names,String element) {
        String[] result = new String[names.length + 1];

        int i = 0;
        for (String each : names) {
            result[i++] = each;
        }
        result[names.length-1] = element;
        return result;
    }

    public static char[] addChar(char[] array,char element) {

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[result.length-1] = element;//element need to be assigned to the last index
        return result;
    }

    }

/*
Task2:
		1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array

 */