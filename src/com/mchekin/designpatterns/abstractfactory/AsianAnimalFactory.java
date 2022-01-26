package com.mchekin.designpatterns.abstractfactory;

public class AsianAnimalFactory implements AnimalFactory {
    @Override
    public Rhino createRhino() {
        return new AsianRhino();
    }

    @Override
    public Elephant createElephant() {
        return new AsianElephant();
    }
}
