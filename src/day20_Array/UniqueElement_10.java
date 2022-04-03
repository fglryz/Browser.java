package day20_Array;

public class UniqueElement_10 {
    public static void main(String[] args) {

        String[] word = {"Layan", "Layan", "Olexhandr", "Adam", "Adam","Cihad" ,"Cydeo"};

        for (int j = 0; j <word.length ; j++) {

            String element = word[j];
                  int frequency = 0;
        for (int i = 0; i < word.length; i++) {
            if(word[i].equals(element)){
                frequency++;
            }

        }
        if(frequency==1){
            System.out.println(element);



    }
}
    }}
