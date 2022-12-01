package Toys;

public class USATrainToy extends TrainToy{

    private String flag = "USA";
    private Integer quantityOfPassengers = 10;

    public USATrainToy(String color, Boolean stream) {
        super(color, stream);
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getQuantityOfPassengers() {
        return quantityOfPassengers;
    }

    public void setQuantityOfPassengers(Integer quantityOfPassengers) {
        this.quantityOfPassengers = quantityOfPassengers;
    }

    @Override
    public String describe()
    {
        return super.describe()+"\n\t"+flag+" flag\n\t"+quantityOfPassengers+" seats";
    }
}
