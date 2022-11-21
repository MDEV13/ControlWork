package Toys;

public class AustriaBillyBearToy extends BearToy {

    private String jacket = "Light-blue with flag of Austria";
    private String gloves = "Orange-white";
    public AustriaBillyBearToy(String colorOfEyes, String colorOfFluff) {
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
