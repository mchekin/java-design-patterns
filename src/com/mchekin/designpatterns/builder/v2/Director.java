package com.mchekin.designpatterns.builder.v2;

import com.mchekin.designpatterns.builder.v2.parts.*;

public class Director {

    public void banditArmour(Builder builder) {
        builder.setBreastPlate(new BreastPlate())
                .setGreaves(new Greaves());
    }

    public void knightArmour(Builder builder) {
        builder.setHelmet(new Helmet())
                .setPauldrons(new Pauldrons())
                .setRerebrace(new Rerebrace())
                .setVambrace(new Vambrace())
                .setGauntlets(new Gauntlets())
                .setCuisses(new Cuisses())
                .setSabatons(new Sabatons())
                .setGreaves(new Greaves())
                .setPoleyns(new Poleyns())
                .setBreastPlate(new BreastPlate());
    }
}
