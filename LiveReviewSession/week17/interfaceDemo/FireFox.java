package week17.interfaceDemo;

public class FireFox implements Webriver{
    public FireFox (){
        System.out.println("lauching firefox browser");
    }
    @Override
    public void get(String url) {

    }

    @Override
    public void finfElement(String locator) {

    }

    @Override
    public void quit() {

    }

    @Override
    public String gettitle() {
        return null;
    }
}
