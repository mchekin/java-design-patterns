package com.mchekin.designpatterns.factorymethod;

public class German implements Language{
    @Override
    public String greeting() {
        return "Hallo!";
    }
}
