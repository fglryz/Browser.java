package day40_FinalKeyWord;

public class FinalVariable {
    final String birthDay;
   final static String name;
    static{
        name="Batch EU8";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;

    }

    public static void main(String[] args) {
       final double pi=3.14;
       //pi=2.3;final variables can not be reassigned
       final String name;
        name="java";
        System.out.println(name);


        System.out.println("------------------------");


        FinalVariable obj=new FinalVariable("May/01");
        //obj.birthDay="june/2002";//final variable can not be reassigned
        System.out.println("------------------------");
        //FinalVariable.name="Python";
        System.out.println(FinalVariable.name);
    }
}
