package day21_ForEachLoop;

public class VowelsNumber {
    public static void main(String[] args) {
        String str="How many days will you read? ";
        char[] chars=str.toCharArray();
        int count=0;
        for (char c:chars){
            switch (c){
                case'a':case'b':case'e':case'o':case'u':
                    count++;
                    break;
        }
        }
        System.out.println(count);
    }
}
