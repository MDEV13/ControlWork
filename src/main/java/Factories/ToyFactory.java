package Factories;

import Toys.Toy;

public abstract class ToyFactory {

    public Toy tie(String kindOfToy)
    {
        Toy toy = factoryMethod(kindOfToy);
        toy.describe();
        return toy;
    }

    abstract Toy factoryMethod(String kindOfToy);

}
