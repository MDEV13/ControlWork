package Toys;

public class TrainToy implements Toy{

    protected Boolean stream;
    protected String color;

    protected TrainToy(String color,Boolean stream) {
        this.color = color;
        this.stream = stream;
    }

    protected Boolean getStream() {
        return stream;
    }

    protected void setStream(Boolean stream) {
        this.stream = stream;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    @Override
    public String describe() {
        return "Descrition: \n\t"+ color+ " body\n\t" + (stream ? "Old" : "Modern") + " type";
    }
}
