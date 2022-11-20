package Factories;

import Toys.*;

import java.util.HashMap;

public class RigaToyFactory extends ToyFactory{
    private HashMap<String,Integer> toyCoutner;

    public RigaToyFactory() {
        this.toyCoutner = new HashMap<>();
    }

    @Override
    protected Toy factoryMethod(String kindOfToy) {

        if(kindOfToy.equals("Lisa")) {
            countProcess(kindOfToy);
            return new LisaToy("Riga");
        }
        if(kindOfToy.equals("Billy")){
            countProcess(kindOfToy);
            return new BillyToy("Riga");
        }
        if(kindOfToy.equals("Susan")) {
            countProcess(kindOfToy);
            return new SusanToy("Riga");
        }
        if(kindOfToy.equals("Teddy"))
        {
            countProcess(kindOfToy);
            return new TeddyToy("Riga");
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
