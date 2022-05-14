package week18.poly_demo;

public class ElementTest {
    public static void main(String[] args) {
        Links links=new Links();//no ploy;it reaches implementation of the method
        links.click();
        links.getLinkHref();
        links.getText();
        links.sendKeys("EU8");

        WebElement loginLink=new Links();//there is polymorphic way
        loginLink.click();//dynamic poly=dynamic binding
        String text=loginLink.getText();
        System.out.println("tex "+text);
        loginLink.sendKeys("EU8");
        ((Links)loginLink).getLinkHref();//explicit down casting

        WebElement userName=new InputField();
        userName.click();
        userName.sendKeys("superMan");

        System.out.println("----Changed object of the referance type----");
        ((InputField) userName).getValue();//this method can be reached with casting
        userName=new Links();
        userName.click();

        ((Links)userName).getLinkHref();
        userName=new InputField();
        //2 objects InputField,links
        WebElementUtilities.clickElement(loginLink);
        WebElementUtilities.clickElement(userName);
       // WebElementUtilities.clickElement(new String("hello"));string class is not a child of web element

         WebElementUtilities.clickElement(links);
        // WebElement login=new  WebElementUtilities.getLinkWithText("login");
        // login.click();
        WebElement login = WebElementUtilities.getLinkWithText("login");
        login.click();
        ((Links)login).getLinkHref();

    }
}
