package Factories;

import Toys.*;

import java.util.HashMap;

public class USAToyFactory extends ToyFactory{
    private HashMap<String,Integer> toyCounter;

    public USAToyFactory() {
        this.toyCounter = new HashMap<>();
    }

    @Override
    protected Toy factoryMethod(String kindOfToy) {

        if(kindOfToy.equalsIgnoreCase("bear")) {
            countProcess(kindOfToy);
            return new USABearToy("Blue","White");
        }
        else if(kindOfToy.equalsIgnoreCase("train")) {
            countProcess(kindOfToy);
            return new USATrainToy("Brown",false);
        }

        return null;
    }

    private void countProcess(String kind)
    {
        if(!toyCounter.containsKey(kind))
        {
            toyCounter.put(kind,1);
        }
        else toyCounter.replace(kind,toyCounter.getOrDefault(kind,0)+1);
    }

    public HashMap<String, Integer> getProdToyList() {
        return toyCounter;
    }

    public Integer getToyProd(String kind) {
        return toyCounter.getOrDefault(kind,0);
    }

}
