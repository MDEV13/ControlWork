package Toys;

public class BearToy implements Toy {
    protected String colorOfEyes;
    protected String colorOfFluff;

    protected BearToy(String colorOfEyes,String colorOfFluff) {
        this.colorOfEyes = colorOfEyes;
        this.colorOfFluff = colorOfFluff;
    }

    protected String getColorOfEyes() {
        return colorOfEyes;
    }

    protected void setColorOfEyes(String colorOfEyes) {
        this.colorOfEyes = colorOfEyes;
    }

    protected String getColorOfFluff() {
        return colorOfFluff;
    }

    protected void setColorOfFluff(String colorOfFluff) {
        this.colorOfFluff = colorOfFluff;
    }

    @Override
    public String describe() {
        return "Descrition: \n\t"+ colorOfEyes+ " eyes\n\t" + colorOfFluff + " fluff";
    }
}
