package Factories;

import Toys.Toy;

import java.sql.SQLOutput;

public abstract class ToyFactory {

    public Toy tie(String kindOfToy)
    {
        Toy toy = factoryMethod(kindOfToy);
        System.out.println(toy.describe());
        return toy;
    }

    abstract Toy factoryMethod(String kindOfToy);

}
