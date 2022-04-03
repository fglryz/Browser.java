package week5;

public class Dynamicsubstring {
    public static void main(String[] args) {

        String searchResult="result count:12345";
//substring method;it takes index location of the char,return to a new string.
        System.out.println(searchResult.substring(13));

        System.out.println(searchResult.substring(13,18));
        System.out.println(searchResult.indexOf(":"));//12
        int colonIndex=searchResult.indexOf(':');
        System.out.println(searchResult.substring(colonIndex+1));

        System.out.println(searchResult.substring(searchResult.indexOf(":")+1));
        String newsearchResult=searchResult.substring(searchResult.indexOf(":")+1);
        System.out.println("newsearchResult="+newsearchResult);


       /* String searchResultTwo="username:oscar search result count:12345";
        int firstcolon=searchResultTwo.indexOf(":");
        System.out.println("firstcolon :"+firstcolon);
        int secondscolon=searchResultTwo.lastIndexOf(":"+1);
        System.out.println(secondscolon);
        System.out.println(searchResultTwo.substring(secondscolon+1,secondscolon+6));
*/

        String searchResultTwo = " username:oscar search result count:12345 more colon : more ";
        int firstColon = searchResultTwo.indexOf(":");
        System.out.println("firstColon = " + firstColon);
        int secondColon = searchResultTwo.indexOf(":",firstColon+1);
        System.out.println("secondColon = " + secondColon);

        System.out.println(searchResultTwo.substring(secondColon+1,secondColon+6)); // 12345
        // secondColon+1 : begining index
        // secondColon+6 : ending index


        String today="I coded a lot of [java] today";//imagine that inside square bracet is dynamic

        String colon=today.substring(today.indexOf("[")+1,today.indexOf("]"));
        System.out.println(colon);






}}
