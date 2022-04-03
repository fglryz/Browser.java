package day16_forLoop_String;

public class RemovingDuplicate {
    public static void main(String[] args) {


        String str = "aabbcc";//abc

        String result = "";

        for (int i = 0; i < str.length(); i++) {//i;represent the all the index number of str(start from 0
            String ch = "" + str.charAt(i);//represent each character of str

            if (!result.contains(ch)) {//if the character is not contained in the result

                result += ch;//the character will be added to the result
            }
        }


        System.out.println(result);


    }
}
/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String 
				  Condition: the character is not contained in the other String yet before you are adding
 */