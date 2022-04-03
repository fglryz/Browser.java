package day10_NestedIf;

public class Gradereport1 {
    public static void main(String[] args) {

        int score=190;

        if(score>=0&&score<=100){//if the score is valid
            //5 possibility,A,B,C,D,E

            if(score>= 90 ){ //false:  score < 90
                System.out.println("Excellent");
            }else if(score >= 80 ){ // false: score < 80
                System.out.println("Great");
            }else if(score >= 70){ // false: score < 70
                System.out.println("Good");
            }else if(score >= 60){// false: score < 60
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }
        else{
            System.out.println("invalid score");
        }

        System.out.println("*************************************");



        String result=(score>=0&&score<=100)? (score>= 90 )?"Excellent" : (score >= 80 )?"Great" :(score >= 70 )?
                      "Good" :(score >= 60 )? "Passed":"Failed":"invalid Score";
        System.out.println(result);



        System.out.println("****************************************");
String result1;
        if(score>=0&&score<=100){
            result=(score>= 90 )?"Excellent" : (score >= 80 )?"Great" :(score >= 70 )?
                    "Good" :(score >= 60 )? "Passed":"Failed";
        }
        else{
            System.out.println("invalid score");
        }

            System.out.println(result);





        }


    }

