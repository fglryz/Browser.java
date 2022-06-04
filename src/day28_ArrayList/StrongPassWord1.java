package day28_ArrayList;

public class StrongPassWord1 {
    public static void main(String[] args) {

        String password = "Cydeo1990%";
        int  countUppercase=0;
        int  countLowercase=0;
        int  countDigits=0;
        int  countSpecialCharacter=0;
        for (int i = 0; i <password.length() ; i++) {
            char each=password.charAt(i);
            if(Character.isUpperCase(each)){
                countUppercase++;
            }
            else if (Character.isLowerCase(each)) {
                countLowercase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            } else {//special char
                countSpecialCharacter++;
            }
        }
        System.out.println("countSpecialCharacter = " + countSpecialCharacter);
        System.out.println("countLowercase = " + countLowercase);
        System.out.println("countUppecase = " + countUppercase);
        System.out.println("countDigits = " + countDigits);

        boolean hasUpperCase=countUppercase>0;
        boolean hasLoverCase=countUppercase>0;
        boolean hasDigits=countDigits>0;
        boolean hasSpecialCharacters=countSpecialCharacter>0;
        boolean strongPassword=password.length()>=8&&!password.contains(" ")&&hasUpperCase&&hasDigits&&
                hasSpecialCharacters&&hasDigits;

        System.out.println("strongPassword = " + strongPassword);


    }
}
/*
        PasswordValidation:
        Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
        1. Password MUST be at least have 8 characters long, and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lower case letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit
        */