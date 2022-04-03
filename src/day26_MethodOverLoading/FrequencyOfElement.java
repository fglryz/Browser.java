package day26_MethodOverLoading;

public class FrequencyOfElement {

        public static void main(String[] args) {
            int[] arr = {1, 1, 1, 2, 2, 5, 5, 5, 5, 4, 1, 1, 1,};

            int n=frequencyOfElement(arr,1);
            System.out.println("n = " + n);
            System.out.println("n = " + n);

        }
        //                                        [1,1,1,2,3,4,5]
        public static int frequencyOfElement(int[] array,int element){
            int count=0;
            for (int each : array) {
                if(each==element){
                    count++;
                }

            }
            return  count;

        }
        public static int frequencyOfElement(double[] array, double element) {
            int count = 0;
            for (double each : array) {
                if (each == element) {
                    count++;
                }

            }
            return count;


        }
        public static int frequencyOfElement(char[] array, char element) {
            int count = 0;
            for (char each : array) {
                if (each == element) {
                    count++;
                }

            }
            return count;


        }
        public static int frequencyOfElement(String[] array, String element) {
            int count = 0;
            for (String each : array) {
                if (each .equals( element)) {
                    count++;
                }

            }
            return count;


        }

    }

