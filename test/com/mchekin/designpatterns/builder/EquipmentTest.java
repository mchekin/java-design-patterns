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

        Equipment equipment = builder.build();

        assertEquals("Bronze helmet", equipment.getHead());
        assertEquals("Bronze breastplate", equipment.getTorso());
        assertEquals("Bronze greaves", equipment.getLegs());
        assertEquals("Doru spear", equipment.getMainHand());
        assertEquals("Hoplon shield", equipment.getOffhand());
        assertEquals("Xiphos short sword", equipment.getHip());
    }
}