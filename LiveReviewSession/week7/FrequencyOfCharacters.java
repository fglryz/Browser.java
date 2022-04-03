package week7;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="aabccd";
        String result="" ;//a2b1c3d1


        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);//'a'

            int count=0;

            for (int j = 0; j <str.length() ; j++) {
                char each=str.charAt(j);

                if(ch==each){
                    count++;
                }

            }
            if(result.contains(""+ch)) {
                continue;
            }
            result+=ch;
            result+=count;


        }
        System.out.println(result);
    }
}
