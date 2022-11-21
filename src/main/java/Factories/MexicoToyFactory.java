package Factories;

import Toys.*;

import java.util.HashMap;

public class MexicoToyFactory extends ToyFactory{
    private HashMap<String,Integer> toyCounter;

    public MexicoToyFactory() {
        this.toyCounter = new HashMap<>();
    }

    @Override
    protected Toy factoryMethod(String kindOfToy) {

        if(kindOfToy.equals("Billy")) {
            countProcess(kindOfToy);
            return new MexicoBillyBearToy("Green","Dark-brown");
        }
        else if(kindOfToy.equals("Teddy")) {
            countProcess(kindOfToy);
            return new MexicoTeddyBearToy("Brown","Dark-brown");
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
