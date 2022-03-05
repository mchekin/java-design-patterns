package com.mchekin.designpatterns.factorymethod.v2;

public class FrenchVillager implements Villager {

    @Override
    public String hello() {
        return "Salut!";
    }

    @Override
    public String bye() {
        return "Au revoir!";
    }
}
