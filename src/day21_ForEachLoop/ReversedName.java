package day21_ForEachLoop;

public class ReversedName {
    public static void main(String[] args) {


        String[] names={"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
                "API Testing", "Database Testing", "Manual Testing"};

        for (String each : names) {//each;Cydeo School", "Wooden Spoon"......
            String reversed = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);

            }
            System.out.println(reversed);

        }

        /*
        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverseName = "";

            for (int j = name.length()-1; j >= 0; j--) {
                reverseName += name.charAt(j);
            }

            System.out.println(reverseName);

         */



    }
}
