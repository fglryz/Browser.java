package week4;

import java.util.ArrayList;

public class GroceryList {//blue print for all my shopping lists

    private ArrayList<String>groceryLists;
    {
        groceryLists=new ArrayList<>();
    }


    public void addGroceryItem(String item){
        groceryLists.add(item);

    }

    @Override
    public String toString() {
        String list="you have "+ groceryLists.size()+" item in your grocery list";
        for (int i = 0; i <groceryLists.size() ; i++) {
            list+="\n"+(i+1)+"."+groceryLists.get(i);

        }

        return list;
    }
    public void modifyGroceryItem(int position,String newItem){
        groceryLists.set(position,newItem);
        System.out.println("Grocery Item "+ (position+1)+" has been modified.");
    }

    public void removeGroceryItem(int position){
        groceryLists.remove(position);

    }
    public String findItem(String searchItem){
        String searchResult="Not found";
        int position=groceryLists.indexOf(searchItem);
        if(position>0){
            searchResult=searchItem+" item found at line  "+(position+1);
        }
        return searchResult;

    }


}

