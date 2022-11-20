package Factories;

import Toys.*;

import java.util.HashMap;

public class BuharestToyFactory extends ToyFactory{

    private HashMap<String,Integer> toyCoutner;

    public BuharestToyFactory() {
        this.toyCoutner = new HashMap<>();
    }

    @Override
    protected Toy factoryMethod(String kindOfToy) {

        if(kindOfToy.equals("Lisa")) {
            countProcess(kindOfToy);
            return new LisaToy("Buharest");
        }
        if(kindOfToy.equals("Billy")){
            countProcess(kindOfToy);
            return new BillyToy("Buharest");
        }
        if(kindOfToy.equals("Susan")) {
            countProcess(kindOfToy);
            return new SusanToy("Buharest");
        }
        if(kindOfToy.equals("Teddy"))
        {
            countProcess(kindOfToy);
            return new TeddyToy("Buharest");
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
