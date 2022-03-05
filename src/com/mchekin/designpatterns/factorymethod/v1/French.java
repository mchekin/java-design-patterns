package com.mchekin.designpatterns.factorymethod.v1;

public class French implements Language {
    @Override
    public String greeting() {
        return "Salut!";
    }
}
