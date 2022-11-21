package Toys;

public class GermanyBillyBearToy extends BearToy {

    private String costume = "Yellow";
    private String glass = "Green";

    public GermanyBillyBearToy(String colorOfEyes, String colorOfFluff) {
        super(colorOfEyes, colorOfFluff);
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    @Override
    public String describe()
    {
        return super.describe()+"\n\t"+costume+" costume\n\t"+glass+" glass";
    }
}
