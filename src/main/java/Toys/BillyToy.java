package Toys;

public class BillyToy implements Toy{

    private String prodCity;

    public BillyToy(String prodCity) {
        this.prodCity = prodCity;
    }
    private String name = "Billy";
    private String color = "Green";
    private String feature = "Sword and shield";

    public void describe()
    {
        System.out.println("Descrition: \n\t"+ prodCity + "\n\t" + name + "\n\t" + color + "\n\t" + feature);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
