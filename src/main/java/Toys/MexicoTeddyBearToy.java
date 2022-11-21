package Toys;

public class MexicoTeddyBearToy extends BearToy{

    private String hat = "Red with bells";

    private String gun = "Black with bullets";

    public MexicoTeddyBearToy(String colorOfEyes, String colorOfFluff) {
        super(colorOfEyes, colorOfFluff);
    }

    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    @Override
    public String describe() {
        return super.describe()+"\n\t"+hat+" hat\n\t"+gun+" gun";
    }
}
