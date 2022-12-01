package Factories;

import Toys.*;

import java.util.HashMap;

public class GermanyToyFactory extends ToyFactory{

    private HashMap<String,Integer> toyCounter;

    public GermanyToyFactory() {
        this.toyCounter = new HashMap<>();
    }

    @Override
    protected Toy factoryMethod(String kindOfToy) {

        if(kindOfToy.equalsIgnoreCase("bear")) {
            countProcess(kindOfToy);
            return new GermanyBearToy("Green","Dark-brown");
        }
        else if(kindOfToy.equalsIgnoreCase("train")) {
            countProcess(kindOfToy);
            return new GermanyTrainToy("Blue",true);
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
