package day22_DimentionalArray;

import java.util.Arrays;

public class ReversedSentence {
    public static void main(String[] args) {

       String sentence = "Today is a good day to learn Java";
       String[] word=sentence.split(" ");
        System.out.println(Arrays.toString(word));
        String reversedSentence=" ";


        for (int i = word.length - 1; i >= 0; i--) {
            reversedSentence+=word[i]+" ";


        }
        System.out.println(reversedSentence);



    }}

/*
 Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";

			output:
				Java learn to day good a is Today
 */