package week11;

import java.util.ArrayList;

public class TVTest {
    public static void main(String[] args) {

        // we will create a TV object

        TV Samsung = new TV(1,4,true); // new keyword invokes our constructor with no parameters
        System.out.println(Samsung);
        TV LG=new TV(3,5,false);
        TV Sony = new TV(3,5,false);

        // Arraylist
        ArrayList<TV> tvList = new ArrayList<>();
        tvList.add(Samsung);
        tvList.add(LG);
        tvList.add(Sony);

        for(TV eachTv : tvList){   // eachTv: becomes object reference for our TV objects
            System.out.println("Is the TV on ? "+eachTv.on);
        }



    }}
