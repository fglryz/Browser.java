package day16_forLoop_String;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str="aaabccc";
        String result="";



        for(int i=0; i<str.length();i++ ) {
            String ch =""+str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {//if the first and last index number of the character same then character
                // is inique
                result += ch;

            }}
        System.out.println("result = " + result);
    }}
        
        


/*
3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2


 */