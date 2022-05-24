package day51_Map;

public class TestEnum {
    public static void main(String[] args) {



   // String browser="Wooden Spoon";
    Browser browser=Browser.SAFARI;
    switch(browser){
        case FIREFOX:
            System.out.println("firefox is selected");
            break;
        case SAFARI:
            System.out.println("safari is selected");
            break;
        case OPERA:
            System.out.println("opera is selected");
            break;
        case EDGE:
            System.out.println("edge is selected");
            break;
        default:
            System.out.println("chrome is selected");


    }
        System.out.println("==============================");
    Season season=Season.SPRING;
}}
