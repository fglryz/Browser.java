package week4;

public class AmazonFreeShipping {
    public static void main(String[] args) {

        double totalprice = 55.50;


        if (totalprice >= 25) {
            System.out.println("Free shipping eligible.Your order:" + "$" + totalprice);
        } else {
            System.out.println("not eligible for free shipping");
        }
    }
}
