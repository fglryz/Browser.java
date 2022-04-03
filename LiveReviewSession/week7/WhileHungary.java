package week7;

public class WhileHungary {
    public static void main(String[] args) {


        boolean isHungary = true;
        //      boolean isHungary = true;
        int bananas = 0;
        int countToFull = 3;
  /*
        while(isHungary){
            bananas++;
            System.out.println("Eating a banana: \uD83C\uDF4C "+bananas);
@@ -15,7 +16,17 @@ public static void main(String[] args) {
                isHungary = false;
            }
        }
*/

        while (true){
            // condition that will take us out of the loop
            if(bananas==countToFull){
                break;  // branching statement
            }
            bananas++;
            System.out.println("Eating a banana: \uD83C\uDF4C "+bananas);

        }
        System.out.println("Had enough bananas, let's get back to study");

        System.out.println("Had enough bananas,let's back to studies");
}}
