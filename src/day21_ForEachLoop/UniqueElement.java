package day21_ForEachLoop;

public class UniqueElement {
    public static void main(String[] args) {
        String[] word = {"Layan", "Layan", "Olexhandr", "Adam", "Adam", "Cihad", "Cydeo" };

        for (String each : word) { // each: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"

            int count = 0;

            for (String element : word) { // element: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"
                if (element.equals(each)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each);
            }


        }
    }}
