package week9;

public class CombineStrings {
    public static void main(String[] args) {
        //"Java","apple"==>Javaapple

        System.out.println(combineString("java","apple"));
        System.out.println((combineString("Java","fun")));
    }
    public static String combineString(String str1,String str2) {
        String combined=" ";
        int biggest=str1.length()>str2.length()?str1.length():str2.length();
        for(int i=0;i<biggest;i++){
            if(i<str1.length()){
                combined+= str1.charAt(i);
            }
            if(i<str2.length()){
                combined+=str2.charAt(i);
            }

        }
        return combined;
    }


}
