package utilities;

public class Sleep {
    public static void sleep(double second){

        try {
            Thread.sleep((long)(second*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
}}
