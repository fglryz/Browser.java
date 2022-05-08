package week17.interfaceDemo;

public class ChromeDriver implements Webriver{
    public ChromeDriver(){
        System.out.println("lauching Chrome browser");
    }

    @Override
    public void get(String url) {
        System.out.println("Chrome driver  navigating to url"+url);
    }

    @Override
    public void finfElement(String locator) {
        System.out.println("locating element by "+ locator);

    }

    @Override
    public void quit() {
        System.out.println("quiting the driver");

    }

    @Override
    public String gettitle() {
        return "EU8 UI Automation";
    }
}
