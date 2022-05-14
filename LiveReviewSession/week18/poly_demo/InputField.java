package week18.poly_demo;

public class InputField implements WebElement{
    public String  getValue(){
        System.out.println("Getting value of the inputFields");
        return "Selenium";
    }
    @Override
    public void sendKeys(String txt) {
        System.out.println("Typing"+txt);
    }

    @Override
    public void click() {
        System.out.println("Clicking on the inputfield");

    }

    @Override
    public String getText() {
        System.out.println("Getting text f input fields");
        return "Java";
    }
}
