package Toys;

public class AustriaTeddyBearToy extends BearToy {

    private String jacket = "Blue";
    private String gloves = "White";
    public AustriaTeddyBearToy(String colorOfEyes, String colorOfFluff) {
        super(colorOfEyes, colorOfFluff);
    }

    public String getJacket() {
        return jacket;
    }

    public void setJacket(String jacket) {
        this.jacket = jacket;
    }

    public String getGloves() {
        return gloves;
    }

    public void setGloves(String gloves) {
        this.gloves = gloves;
    }

    @Override
    public String describe() {
        return super.describe() + "\n\t"+jacket+" jacket\n\t"+gloves+" gloves";
    }
}
