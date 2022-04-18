package Week14.BrowserPgesinheritance;

public class AmazonHomepage  extends Browser{
    public String product;



    public AmazonHomepage(String name) {//superclass constructor always execute before subclass constructor
        super(name);
    }
    public void navigateTo(String link){
        System.out.println("Navigating to "+link+" using "+super.getName());
    }

public void shopFor(String product){
        this.product=product;//instead of initializing in the constructor I acan do it in this method as well

    System.out.println("Navigating to "+ this.product+" 's procuct" );
}
}
