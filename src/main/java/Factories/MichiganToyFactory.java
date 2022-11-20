package Factories;

import Toys.*;

import java.util.HashMap;

public class MichiganToyFactory extends ToyFactory{
    private HashMap<String,Integer> toyCoutner;

    public MichiganToyFactory() {
        this.toyCoutner = new HashMap<>();
    }

    @Override
    protected Toy factoryMethod(String kindOfToy) {

        if(kindOfToy.equals("Lisa")) {
            countProcess(kindOfToy);
            return new LisaToy("Michigan");
        }
        if(kindOfToy.equals("Billy")){
            countProcess(kindOfToy);
            return new BillyToy("Michigan");
        }
        if(kindOfToy.equals("Susan")) {
            countProcess(kindOfToy);
            return new SusanToy("Michigan");
        }
        if(kindOfToy.equals("Teddy"))
        {
            countProcess(kindOfToy);
            return new TeddyToy("Michigan");
        }

        return null;
    }

    private void countProcess(String kind)
    {
        if(!toyCoutner.containsKey(kind))
        {
            toyCoutner.put(kind,1);
        }
        else toyCoutner.replace(kind,toyCoutner.getOrDefault(kind,0)+1);
    }

    public HashMap<String, Integer> getProdToyList() {
        return toyCoutner;
    }

    public Integer getToyProd(String kind) {
        return toyCoutner.getOrDefault(kind,0);
    }
}
