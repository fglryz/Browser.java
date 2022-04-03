package day25_MethodOverloading;

public class Min {
    
    public static int[] min(int[] numbers){
        int min=numbers[0];
        for (int number : numbers) {
            
            if(min>number){
                min=number;
            }
            
        }
        return numbers;
    
}
    public static double[] min(double[] numbers){
        double min=numbers[0];
        for (double number : numbers) {

            if(min>number){
                min=number;
            }

        }
        return numbers;

    }
    public static float[] min(float[] numbers){
        float min=numbers[0];
        for (float number : numbers) {

            if(min>number){
                min=number;
            }

        }
        return numbers;

    }
    public static long[] min(long[] numbers){
        long min=numbers[0];
        for (long number : numbers) {

            if(min>number){
                min=number;
            }

        }
        return numbers;

    }
    public static short[] min(short[] numbers){
        short min=numbers[0];
        for (short number : numbers) {

            if(min>number){
                min=number;
            }

        }
        return numbers;

    }
    public static byte[] min(byte[] numbers){
        byte min=numbers[0];
        for (byte number : numbers) {

            if(min>number){
                min=number;
            }

        }
        return numbers;

    }

}
/*
Task 3:
	1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from int array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array

 */
