package week01;

public class Test {
    public static void main(String[] args) {
        StringManipulator objOne=new StringManipulator("java");

        System.out.println(objOne.str);
        StringManipulator obj2=new StringManipulator("Selenium");
        System.out.println(obj2.str);
        objOne.fistTwoChars();//called the method->I want my method do the Action
        System.out.println(objOne.str);
        System.out.println(obj2.str);
        System.out.println(objOne.x);//you need to call the attribute or method  they get into effect

        

        String password=obj2.tripler();
        System.out.println(password);
    }
}
