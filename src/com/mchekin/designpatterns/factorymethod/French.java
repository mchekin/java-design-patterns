package com.mchekin.designpatterns.factorymethod;

public class French implements Language{
    @Override
    public String greeting() {
        return "Salut!";
    }
}
