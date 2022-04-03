package day24Custommethodes_Return;

public class Palondrime {
    public static void main(String[] args) {
        System.out.println(isPalidrome("level"));
    }

    public static boolean isPalidrome(String str){
        String reversed=ReverseReturn.reverse(str);
        return reversed.equalsIgnoreCase(str);
    }
}
