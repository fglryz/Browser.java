package day10_NestedIf;

public class FieldTrip1 {
    public static void main(String[] args) {

int grade=1;
String location=" ";
int groupNumber=0;
String teacher=" ";

        if(grade>=1&&grade <=6) {

            if (grade == 1) {
                location = "Apple orchard";
                groupNumber = 3;
                teacher = "Ms.Smith";
            } else if (grade == 2){
                location = "Zoo";
            groupNumber = 7;
            teacher = "Ms.Lee";}

            else if(grade==3){
                location ="Aquarium";
                groupNumber = 5;
                teacher =" Ms. Wilson";}


        else if(grade==4){
            location =" Aquarium" ;
            groupNumber= 5;
            teacher="Ms. Wilson";
        }

        else if(grade==5){
            location = "Museum ";
        groupNumber=5;
        teacher="Ms. Lela";
        }
        else if(grade==6){
           location = "Six Flags";
                 groupNumber=8;
                  teacher=" Mr. Watt";
        }}
        else{
            System.out.println("Invalid Grade");
        }
        System.out.println("Location= "+location+"\nGroup Number= "+groupNumber+"\nTeacher= "+teacher);




    }
}
