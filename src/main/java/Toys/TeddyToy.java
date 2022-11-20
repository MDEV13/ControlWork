package Toys;

public class TeddyToy implements Toy {

    private String name = "Teddy";
    private String color = "Brown";
    private String feature = "Costume and hat";
    private String prodCity;

    public TeddyToy(String prodCity) {
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
