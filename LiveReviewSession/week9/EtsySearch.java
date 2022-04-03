package week9;

public class EtsySearch {
    public static void main(String[] args) {
        System.out.println("-----Starting UI automation for ETS website--------------");
        openBrowser("Chrome");
        navigateToUrl("http://www.etsy.com");
        searchItem(" Java");
        //if(verfyItemIsDisplayed().equals("Pass")){
       // System.out.println("your test case pass");}
       // else{
           // System.out.println("failed test case scenario");
        System.out.println(verfyItemIsDisplayed());
    }

    public static void openBrowser(String browser){//chrome firefox edge safari
        System.out.println("Launching "+browser+" browser");
    }
    public static void navigateToUrl(String url){
        System.out.println("navigating to "+url);
    }
    public static void searchItem(String item){
        System.out.println("Pass:verify "+ item+" exist");
        System.out.println("Click on that"+item);
    }
    public static String verfyItemIsDisplayed(){
        String result="Pass";
        return result;
    }
}
