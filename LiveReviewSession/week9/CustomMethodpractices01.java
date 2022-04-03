package week9;

public class CustomMethodpractices01 {
    public static void main(String[] args) {
  eligibleOrNor(45);
  eligibleOrNor(15);
    }

public static void eligibleOrNor(int age){//no return type
    if(age>=21){
        System.out.println("Eligible");
    }
    else{
        System.out.println("not eligible");
    }

}
}
