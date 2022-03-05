package com.mchekin.designpatterns.factorymethod.v2;

public class GermanVillage extends Village {

    @Override
    public Villager createVillager() {
        return new GermanVillager();
    }
}