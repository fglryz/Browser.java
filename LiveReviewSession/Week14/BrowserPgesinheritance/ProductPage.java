package Week14.BrowserPgesinheritance;

public class ProductPage extends AmazonHomepage{
    public ProductPage(String name) {
        super(name);
    }
    public int quantity;

    public ProductPage(String name, int quantity){
        super(name);
        this.quantity=quantity;
    }

    // need: our shopFor method is not specialized enough for this class
    @Override   // annotation should be applicable to the method
    public void shopFor(String product){
        super.product=product;
        System.out.println("Automating "+getName()); // which browser we are automating
        System.out.println("Adding "+quantity+" amount of "+super.product+" to cart");
    }
}
