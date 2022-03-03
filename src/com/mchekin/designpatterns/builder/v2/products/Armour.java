package com.mchekin.designpatterns.builder.v2.products;

import com.mchekin.designpatterns.builder.v2.parts.*;

public class Armour {

    private final Helmet helmet;
    private final Pauldrons pauldrons;
    private final BreastPlate breastPlate;
    private final Rerebrace rerebrace;
    private final Gauntlets gauntlets;
    private final Vambrace vambrace;
    private final Cuisses cuisses;
    private final Poleyns poleyns;
    private final Greaves greaves;
    private final Sabatons sabatons;

    public Armour(
            Helmet helmet,
            Pauldrons pauldrons,
            BreastPlate breastPlate,
            Rerebrace rerebrace,
            Gauntlets gauntlets,
            Vambrace vambrace,
            Cuisses cuisses,
            Poleyns poleyns,
            Greaves greaves,
            Sabatons sabatons
    ) {
        this.helmet = helmet;
        this.pauldrons = pauldrons;
        this.breastPlate = breastPlate;
        this.rerebrace = rerebrace;
        this.gauntlets = gauntlets;
        this.vambrace = vambrace;
        this.cuisses = cuisses;
        this.poleyns = poleyns;
        this.greaves = greaves;
        this.sabatons = sabatons;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public Pauldrons getPauldrons() {
        return pauldrons;
    }

    public BreastPlate getBreastPlate() {
        return breastPlate;
    }

    public Rerebrace getRerebrace() {
        return rerebrace;
    }

    public Gauntlets getGauntlets() {
        return gauntlets;
    }

    public Vambrace getVambrace() {
        return vambrace;
    }

    public Cuisses getCuisses() {
        return cuisses;
    }

    public Poleyns getPoleyns() {
        return poleyns;
    }

    public Greaves getGreaves() {
        return greaves;
    }

    public Sabatons getSabatons() {
        return sabatons;
    }
}
