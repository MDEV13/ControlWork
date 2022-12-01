package Toys;

public class GermanyTrainToy extends TrainToy
{
    private String flag = "Germany";
    private Integer quantityOfPassengers = 25;

    public GermanyTrainToy(String color, Boolean stream) {
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
