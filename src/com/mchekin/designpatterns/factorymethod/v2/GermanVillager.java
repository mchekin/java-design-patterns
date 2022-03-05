package com.mchekin.designpatterns.factorymethod.v2;

public class GermanVillager implements Villager {

    @Override
    public String hello() {
        return "Hallo!";
    }

    @Override
    public String bye() {
        return "Tschüss!";
    }
}
