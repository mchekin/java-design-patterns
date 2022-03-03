package com.mchekin.designpatterns.builder.v2;

import com.mchekin.designpatterns.builder.v2.parts.*;
import com.mchekin.designpatterns.builder.v2.products.ArmourDescriptor;

public class ArmourDescriptorBuilder implements Builder {

    private Helmet helmet;
    private Pauldrons pauldrons;
    private BreastPlate breastPlate;
    private Rerebrace rerebrace;
    private Gauntlets gauntlets;
    private Vambrace vambrace;
    private Cuisses cuisses;
    private Poleyns poleyns;
    private Greaves greaves;
    private Sabatons sabatons;


    public ArmourDescriptor getResult() {
        return new ArmourDescriptor(
                helmet,
                pauldrons,
                breastPlate,
                rerebrace,
                gauntlets,
                vambrace,
                cuisses,
                poleyns,
                greaves,
                sabatons
        );
    }

    @Override
    public Builder setHelmet(Helmet helmet) {
        this.helmet = helmet;

        return this;
    }

    @Override
    public Builder setPauldrons(Pauldrons pauldrons) {
        this.pauldrons = pauldrons;

        return this;
    }

    @Override
    public Builder setBreastPlate(BreastPlate breastPlate) {
        this.breastPlate = breastPlate;

        return this;
    }

    @Override
    public Builder setRerebrace(Rerebrace rerebrace) {
        this.rerebrace = rerebrace;

        return this;
    }

    @Override
    public Builder setGauntlets(Gauntlets gauntlets) {
        this.gauntlets = gauntlets;

        return this;
    }

    @Override
    public Builder setVambrace(Vambrace vambrace) {
        this.vambrace = vambrace;

        return this;
    }

    @Override
    public Builder setCuisses(Cuisses cuisses) {
        this.cuisses = cuisses;

        return this;
    }

    @Override
    public Builder setPoleyns(Poleyns poleyns) {
        this.poleyns = poleyns;

        return this;
    }

    @Override
    public Builder setGreaves(Greaves greaves) {
        this.greaves = greaves;

        return this;
    }

    @Override
    public Builder setSabatons(Sabatons sabatons) {
        this.sabatons = sabatons;

        return this;
    }
}
