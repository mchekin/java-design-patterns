package com.mchekin.designpatterns.builder.v2;

import com.mchekin.designpatterns.builder.v2.parts.*;

public interface Builder {
    Builder setHelmet(Helmet helmet);

    Builder setPauldrons(Pauldrons pauldrons);

    Builder setBreastPlate(BreastPlate breastPlate);

    Builder setRerebrace(Rerebrace rerebrace);

    Builder setGauntlets(Gauntlets gauntlets);

    Builder setVambrace(Vambrace vambrace);

    Builder setCuisses(Cuisses cuisses);

    Builder setPoleyns(Poleyns poleyns);

    Builder setGreaves(Greaves greaves);

    Builder setSabatons(Sabatons sabatons);
}