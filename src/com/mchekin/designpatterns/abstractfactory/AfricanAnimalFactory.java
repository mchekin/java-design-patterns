package com.mchekin.designpatterns.abstractfactory;

public class AfricanAnimalFactory implements AnimalFactory {
    @Override
    public Rhino createRhino() {
        return new AfricanRhino();
    }

    @Override
    public Elephant createElephant() {
        return new AfricanElephant();
    }
}
