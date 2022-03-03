package com.mchekin.designpatterns.builder.v2;

import com.mchekin.designpatterns.builder.v2.parts.*;
import com.mchekin.designpatterns.builder.v2.products.Armour;
import com.mchekin.designpatterns.builder.v2.products.ArmourDescriptor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmourBuilderTest {
    @Test
    void buildKnightArmour() {
        ArmourBuilder armourBuilder = new ArmourBuilder();
        ArmourDescriptorBuilder armourDescriptorBuilder = new ArmourDescriptorBuilder();

        Director director = new Director();

        director.knightArmour(armourBuilder);
        Armour armour = armourBuilder.getResult();

        director.knightArmour(armourDescriptorBuilder);
        ArmourDescriptor armourDescriptor = armourDescriptorBuilder.getResult();

        assertInstanceOf(Cuisses.class, armour.getCuisses());
        assertInstanceOf(BreastPlate.class, armour.getBreastPlate());
        assertInstanceOf(Gauntlets.class, armour.getGauntlets());
        assertInstanceOf(Greaves.class, armour.getGreaves());
        assertInstanceOf(Helmet.class, armour.getHelmet());
        assertInstanceOf(Pauldrons.class, armour.getPauldrons());
        assertInstanceOf(Poleyns.class, armour.getPoleyns());
        assertInstanceOf(Vambrace.class, armour.getVambrace());
        assertInstanceOf(Sabatons.class, armour.getSabatons());

        assertEquals("""
                Description

                Head: Helmet
                Shoulders: Pauldrons
                Chest: Breastplate
                Upper arms: Rerebrace
                Hands: Gauntlets
                Lower arms: Vambrace
                Thighs: Cuisses
                Knees: Poleyns
                Shins: Greaves
                Feet: Sabatons
                """, armourDescriptor.describe());
    }

    @Test
    void buildBanditArmour() {
        ArmourBuilder armourBuilder = new ArmourBuilder();
        ArmourDescriptorBuilder armourDescriptorBuilder = new ArmourDescriptorBuilder();

        Director director = new Director();

        director.banditArmour(armourBuilder);
        Armour armour = armourBuilder.getResult();

        director.banditArmour(armourDescriptorBuilder);
        ArmourDescriptor armourDescriptor = armourDescriptorBuilder.getResult();

        assertNull(armour.getCuisses());
        assertInstanceOf(BreastPlate.class, armour.getBreastPlate());
        assertNull(armour.getGauntlets());
        assertInstanceOf(Greaves.class, armour.getGreaves());
        assertNull(armour.getHelmet());
        assertNull(armour.getPauldrons());
        assertNull(armour.getPoleyns());
        assertNull(armour.getVambrace());
        assertNull(armour.getSabatons());

        assertEquals("""
                Description

                Head: -
                Shoulders: -
                Chest: Breastplate
                Upper arms: -
                Hands: -
                Lower arms: -
                Thighs: -
                Knees: -
                Shins: Greaves
                Feet: -
                """, armourDescriptor.describe());
    }
}