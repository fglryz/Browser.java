package day16_forLoop_String;

public class reverse {
    public static void main(String[] args) {

     String str="Wooden Spoon";
     // index:   0134567...

     String result="";//contain the reversed version str
     //noopS nedooW




        for(int i=str.length()-1;i>=0;i--){// i:index number of str(starting last index to index 0
            result +=str.charAt(i);//adding each caracter to result

        }
        System.out.println(result);



    }
}

/*
Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */
