package day30_CustomClass_Intro;

public class HouseObject {
    public static void main(String[] args) {
        House house1=new House();
        house1.setOf("Semi Detached",25,600000,"3 Bedrooms",true);

        House house2=new House();
        house2.setOf(" Detached",60,500000,"3 Bedrooms",true);

        House house3=new House();
        house3.setOf(" flat",50,300000,"2 Bedrooms",false);

        House house4=new House();
        house4.setOf("Terraced",55,6500000,"4 Bedrooms",true);


        House[] houses={house1,house2,house3,house4};

        double max=houses[0].price;
        double min=houses[0].price;
        int countGarden=0;
        int countNoGarden=0;


        for (House house : houses) {
            if(house.hasGarden){
                countGarden++;
            }
            else{
                countNoGarden++;
            }
            if(house.price>max){
                max= house.price;
            }
            if(house.price<min){
                min= house.price;
            }


        }
        System.out.println("countGarden = " + countGarden);
        System.out.println("countNoGarden = " + countNoGarden);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
