package com.mchekin.designpatterns.builder.v2.products;

import com.mchekin.designpatterns.builder.v2.parts.*;

public class ArmourDescriptor {

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

    public ArmourDescriptor(
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

    public String describe() {
        String info = """
                Description

                """;

        info += "Head: " + (helmet != null ? "Helmet" : "-") + "\n";
        info += "Shoulders: " + (pauldrons != null ? "Pauldrons" : "-") + "\n";
        info += "Chest: " + (breastPlate != null ? "Breastplate" : "-") + "\n";
        info += "Upper arms: " + (rerebrace != null ? "Rerebrace" : "-") + "\n";
        info += "Hands: " + (gauntlets != null ? "Gauntlets" : "-") + "\n";
        info += "Lower arms: " + (vambrace != null ? "Vambrace" : "-") + "\n";
        info += "Thighs: " + (cuisses != null ? "Cuisses" : "-") + "\n";
        info += "Knees: " + (poleyns != null ? "Poleyns" : "-") + "\n";
        info += "Shins: " + (greaves != null ? "Greaves" : "-") + "\n";
        info += "Feet: " + (sabatons != null ? "Sabatons" : "-") + "\n";

        return info;
    }
}
