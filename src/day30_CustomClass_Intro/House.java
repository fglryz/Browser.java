package day30_CustomClass_Intro;

public class House {
    public String type;
    public int age;
    public double price;
    public String size;
    public boolean hasGarden;

    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", price=$" + price +
                ", size='" + size + '\'' +
                ", hasGarden=" + hasGarden +
                '}';
    }

    public void setOf(String type, int age, double price, String size, boolean hasGarden) {
        this.type = type;
        this.age = age;
        this.price = price;
        this.size = size;
        this.hasGarden = hasGarden;


    }
}
