package com.mchekin.designpatterns.factorymethod.v1;

public class German implements Language {
    @Override
    public String greeting() {
        return "Hallo!";
    }
}
