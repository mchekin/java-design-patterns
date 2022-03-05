package com.mchekin.designpatterns.factorymethod.v2;

import java.util.ArrayList;
import java.util.List;

public abstract class Village {

    private final List<Villager> villagers = new ArrayList<>();

    public List<Villager> getVillagers() {
        return villagers;
    }

    public Village grow() {
        villagers.add(createVillager());

        return this;
    }

    /**
     * Factory method
     */
    public abstract Villager createVillager();
}