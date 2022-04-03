package day19_LoopPractice;

public class UniqueCharacterShort {
    public static void main(String[] args) {
        String str = "aaabcccdef";
        String result = "";

        for(int i = 0; i<str.length(); i++) { //i: index numbers of str
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) { // if the first and last index numbers of the character are same,
                //then the character is unique.
                result += ch;
            }
        }
        System.out.println(result);
    }

}
