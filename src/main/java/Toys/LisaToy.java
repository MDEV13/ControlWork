package Toys;

public class LisaToy implements Toy {

    private String prodCity;
    private String name = "Lisa";
    private String color = "Yellow";
    private String feature = "Bag with money and car";

    public LisaToy(String prodCity) {
        this.prodCity = prodCity;
    }

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
