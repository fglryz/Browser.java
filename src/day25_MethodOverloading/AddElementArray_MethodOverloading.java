package day25_MethodOverloading;


import java.util.Arrays;

public class AddElementArray_MethodOverloading {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6};//7
        numbers=addElement(numbers,7);
        char[] chars={'A','B','C','D','E'};//'E'
        chars=addElement(chars,'E');
        String[] names={"Ahmet","Veli","Muhtar","Sinan"};//"Layan"
        names=addElement(names,"Layan");

        System.out.println("names = " + Arrays.toString( names));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("numbers = " + Arrays.toString(numbers));


    }


    public static int[] addElement(int[] array,int element){
        int[] result=new int[array.length+1];
        int i=0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i]=element;
        return result;

    }
    public static double[] addElement(double[] array,double element){
        double[] result=new double[array.length+1];

        int i=0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i]=element;
        return result;

    }

    public static String[] addElement(String[] names,String element) {
        String[] result = new String[names.length + 1];

        int i = 0;
        for (String each : names) {
            result[i++] = each;
        }
        result[names.length-1] = element;
        return result;
    }

    public static char[] addElement(char[] array,char element) {

        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[result.length-1] = element;//element need to be assigned to the last index
        return result;
    }


}
