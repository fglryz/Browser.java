package week5;

public class StringReview02 {
    public static void main(String[] args) {
        //length();it does not tahe parameter,it returns an integer number
        //replace
        //toUpper/LoweCase
       // charAt
        //indexof
        //lastIndexof
        //equals
        //trim

        String message="EU8 is Awesome!!";
        int count=message.length();
        System.out.println("how many characters we have:"+count);
        System.out.println(count==16);
        if(message.length()==16){
            System.out.println("happy testing");

        }

        System.out.println(message.toUpperCase());
        System.out.println("message after uppercase");
        System.out.println(message);
        //assin changes to a referance

        System.out.println(message.toLowerCase());


        String str="  abc  ";
        str=str.trim();
        System.out.println(str.trim());//abc
        System.out.println(str);

        //

       String str2="   abc   def  ";
        str2=str2.replace(" "," ");
        System.out.println(str2);


        String str3 =" EU8 is Awesome!!" ;
        str3=str.trim().replaceFirst(" ","");
        System.out.println(str3);

       String  str4=" EU8 is Awesome!!";
       str4=str4.trim().replaceFirst(" "," ").toUpperCase().substring(3);
        System.out.println(str4);









    }
}
