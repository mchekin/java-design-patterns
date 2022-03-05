package com.mchekin.designpatterns.factorymethod.v2;

public class FrenchVillage extends Village {

    @Override
    public Villager createVillager() {
        return new FrenchVillager();
    }
}