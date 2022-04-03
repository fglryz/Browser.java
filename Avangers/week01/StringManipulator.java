package week01;

public class StringManipulator {

    public String str;//attribute
    public int x;

    public StringManipulator(String str){
        this.str=str;

    }
    public void fistTwoChars(){
        str=str.toUpperCase().substring(0,2);
    }


    public  String  tripler (){
        str=""+str.charAt(str.length()-1)+str.charAt(str.length()-2);
        str=str.repeat(3);
        return str;

    }


}
