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

        if(kindOfToy.equals("Billy")) {
            countProcess(kindOfToy);
            return new USABillyBearToy("Blue","White");
        }
        else if(kindOfToy.equals("Teddy")) {
            countProcess(kindOfToy);
            return new USATeddyBearToy("Green","White");
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
