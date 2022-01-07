package com.mchekin.designpatterns.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EquipmentTest {
    @Test
    void buildHopliteEquipment() {
        Equipment.Builder builder = new Equipment.Builder();

        builder.setHead("Bronze helmet")
                .setTorso("Bronze breastplate")
                .setLegs("Bronze greaves")
                .setMainHand("Doru spear")
                .setOffhand("Hoplon shield")
                .setHip("Xiphos short sword");

        Equipment sut = builder.build();

        assertEquals("Bronze helmet", sut.getHead());
        assertEquals("Bronze breastplate", sut.getTorso());
        assertEquals("Bronze greaves", sut.getLegs());
        assertEquals("Doru spear", sut.getMainHand());
        assertEquals("Hoplon shield", sut.getOffhand());
        assertEquals("Xiphos short sword", sut.getHip());
    }
}