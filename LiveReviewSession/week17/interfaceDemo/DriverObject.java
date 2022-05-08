package week17.interfaceDemo;

public class DriverObject {
    public static void main(String[] args) {
        ChromeDriver driver1=new ChromeDriver();
        FireFox driver2=new FireFox();
        Webriver driver3=new ChromeDriver();
        driver1.get("www.google.com");
        driver1.finfElement("//input[@name='q']");
        System.out.println("title: "+driver1.gettitle());

    }
}
