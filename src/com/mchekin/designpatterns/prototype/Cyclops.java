package com.mchekin.designpatterns.prototype;

public class Cyclops extends Monster {

    public Cyclops(String id) {
        super(id, "Cyclops");
    }

    @Override
    String greeting() {
        return String.format("I am a %s! And I am from Ancient Greece.", this.getType());
    }
}
