package day34_GarbageCollection_AccessModifier;

public class StaticMembers {


 static class class1 {

 }

 public static int num = 100;

 public static void method() {


 }

 static {

 }
}



  class  A{//Outer class

  static class B{//Inner class
   public static void method1(){

   }
  }

 }
 class c{
  public static void main(String[] args) {
   A.B.method1();
  }
 }









