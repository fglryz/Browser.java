package week6;

public class BasicLoopExample {
    public static void main(String[] args) {

        for (int  i=0; i <=1000 ; i+=10) {
            System.out.println(i+" ");
        }


        System.out.println("*********************");


        //==================================
        // initialization
        int z = 0;   // global variable for the whole class
        for(  ; z <= 1000 ;  ){
            if(z%10==0) {
                System.out.print(z + " ");
            }
            z++;
            // z+=10;  // iteration
        }

        System.out.println("z = " + z);
        // difference: if we make the initialization outside the for loop, the variable z can be used within the entire class. Or when the initalization is made within the for loop as usual, then the z only belongs to the loop

        System.out.println("***********************");

        for (int  i=3; i <=130 ;i +=2) {

            System.out.print(i+" ");
        }

        System.out.println("***********************");
          int countOfEven=0;
        for (int  i=5; i <=50 ;i++) {
            if(i%2==0){
                countOfEven+=1;
            }
        }
        System.out.println("count Of Even: "+countOfEven);

        System.out.println("***********************");

        int j=1;
        for (; j<=10 ; j++) {
            System.out.println("12X"+j+"="+(12*j));

        }

        System.out.println("***********************");


    }}
/*
 * Question-1:

 Write a for loop that displays the following set of numbers:

 0,10,20,30,40,50,...1000


 */