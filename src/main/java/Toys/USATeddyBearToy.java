package Toys;

public class USATeddyBearToy extends BearToy {

    private String costume = "Dark-red with flag of USA";
    private String hat = "Red with stars";

    public USATeddyBearToy(String colorOfEyes, String colorOfFluff) {
        super(colorOfEyes, colorOfFluff);
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    @Override
    public String describe()
    {
        return super.describe()+"\n\t"+costume+" costume\n\t"+hat+" hat";
    }
}
