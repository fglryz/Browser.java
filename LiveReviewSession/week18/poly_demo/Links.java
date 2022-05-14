package week18.poly_demo;

public class Links implements WebElement {
    public void  getLinkHref(){
        System.out.println("https://www.java.com");
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("not supported action ");

    }

    @Override
    public void click() {
        System.out.println("Clicking the link");

    }

    @Override
    public String getText() {
        return "Oracle Java";
    }
}
