package day7_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num5=25;
        int num6=-25;

        System.out.println(num5>0);
        System.out.println(num6>0);


        System.out.println("-----------------------------------------");

int q=5;
++q;//pre increment:increase the value by 1 right away
        System.out.println(q);

        --q;//pre decrement;decrease the vaue by 1 right away
        System.out.println(q);

        System.out.println("-----------------------------------------");

int s=100;

        System.out.println(++s);//pre increment:increase the value by 1 right away

        int f=100;
        System.out.println(f++);//post decrement :first pass the current value,then increase the value by 1
        System.out.println(f);//101

        System.out.println("--------------------------------------------");

int v=200;

        System.out.println(v--);//post decrement :first pass the current value,then decrease the value by 1-(200)
        System.out.println(v);//198


        System.out.println("-----------------------------------------");

        int z=45;
            System.out.println(++z);//46, z=46
            System.out.println(z++);//46, z=46
            System.out.println(z);//47 ,  z=47

            int l=30;
            System.out.println(--l);//29 l=29
            System.out.println(l--);//l29, l=29
            System.out.println(l);//28 ,  l=28


            System.out.println("-----------------------------------------");


    }

}





