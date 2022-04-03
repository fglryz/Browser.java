package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        /*
        score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed

         */
        int score=90;

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



        }}
