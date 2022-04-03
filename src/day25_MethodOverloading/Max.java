package day25_MethodOverloading;

public class Max {

    public static int[] max(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (max > number) {
                max = number;
            }
            
        }

        return numbers;
    } 
    public static double[] max(double[] numbers) {
        double max = numbers[0];
        for (double number : numbers) {
            if (max > number) {
                max = number;
            }

        }

        return numbers;
    }
    public static long[] max(long[] numbers) {
        long max = numbers[0];
        for (long number : numbers) {
            if (max > number) {
                max = number;
            }

        }

        return numbers;
    }
    public static float[] max(float[] numbers) {
        float max = numbers[0];
        for (float number : numbers) {
            if (max > number) {
                max = number;
            }

        }

        return numbers;
    }
    public static short[] max(short[] numbers) {
        short max = numbers[0];
        for (short number : numbers) {
            if (max > number) {
                max = number;
            }

        }

        return numbers;
    }
    public static byte[] max(byte[] numbers) {
        byte max = numbers[0];
        for (byte number : numbers) {
            if (max > number) {
                max = number;
            }

        }

        return numbers;
    }
}






/*
Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array
 */