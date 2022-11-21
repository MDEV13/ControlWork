package Toys;

public class MexicoBillyBearToy extends BearToy{

    private String hat = "Yellow Sambrero";

    private String gun = "Black";

    public MexicoBillyBearToy(String colorOfEyes, String colorOfFluff) {
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
