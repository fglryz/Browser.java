package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {

        String str="Java is fun, I love learning Java";
        String str2=str.replace("Java", "Python");//Python is fun, I love learning Python


        System.out.println("str="+str);
        System.out.println("str1="+str2);


        String email="fglryz.111@gmail.com";
       email.replace("gmail", "yahoo");

        System.out.println("email="+email);

        String sentence="Java Java Python Python C++ C++ Python Python Python Python";
        String sentence1=sentence.replace("Python","").replace("  "," ");
        System.out.println(sentence1);

        String s="Dog Dog Dog Dog Dog Dog";
        String s1=s.replace("Dog","Cat");
        System.out.println("s="+s1);

        String result2 = "C# is fun, C# is cool";
        result2 =  result2.replaceFirst("C#", "Java");
        System.out.println(result2);

        System.out.println("*****************************************");


        String s3 = "Java Java Java ";
        s3=s3.replace("Java","Python");
        System.out.println(s3);

        String s4= "Java Java Java ";
        s4 = s4.replaceFirst("Java", "Python"); //""
        System.out.println(s4);


        String result3 = "C# is fun, C# is cool";
        result3 =  result3.replaceFirst("C#", "Java");
        System.out.println(result3);

        String result5 = "Java";
        result5 = result5.replaceFirst("va", "vo"); //"Jova"
        System.out.println(result5);






    }
}
