package utilities;

import java.util.ArrayList;

public class ConvertNonPrimitiveArrayToArrayList {
    public static ArrayList<Integer> convertArrayToArrayList(int[]array){

        ArrayList<Integer>list=new ArrayList<>();
        for (int each:array) {
            list.add(each);

        }
        return list;
    }
}
