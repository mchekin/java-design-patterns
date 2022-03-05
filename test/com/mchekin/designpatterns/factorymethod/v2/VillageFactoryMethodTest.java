package com.mchekin.designpatterns.factorymethod.v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VillageFactoryMethodTest {
    @Test
    public void createFrenchVillager() {
        Village village = new FrenchVillage();

        Villager villager = village.createVillager();

        assertEquals("Salut!", villager.hello());
        assertEquals("Au revoir!", villager.bye());
    }

    @Test
    public void growFrenchVillage() {
        Village village = new FrenchVillage();

        Villager villager = village.grow().getVillagers().get(0);

        assertEquals("Salut!", villager.hello());
        assertEquals("Au revoir!", villager.bye());
    }

    @Test
    public void createGermanVillager() {
        Village village = new GermanVillage();

        Villager villager = village.createVillager();

        assertEquals("Hallo!", villager.hello());
        assertEquals("Tschüss!", villager.bye());
    }

    @Test
    public void growGermanVillage() {
        Village village = new GermanVillage();

        Villager villager = village.grow().getVillagers().get(0);

        assertEquals("Hallo!", villager.hello());
        assertEquals("Tschüss!", villager.bye());
    }
}