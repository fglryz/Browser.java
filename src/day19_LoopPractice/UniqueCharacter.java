package day19_LoopPractice;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "aabcccdeef";
        String result = "";//bdf


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;//represent frequency  of the char


            for (int i = 0; i < str.length(); i++) {//compares the character that outer loop picked,
                // with each character
                char each = str.charAt(i);//each character of str
                if (ch == each) {
                    count++;

                }
            }
           if(count==1){//if the frequency of the character is 1 ,then the character unique
              result+=ch;
        }
    }
        System.out.println(result);

    }}
