package com.mchekin.designpatterns.prototype;

public class Goblin extends Monster {

    public Goblin(String id) {
        super(id, "Goblin");
    }

    @Override
    String greeting() {
        return String.format("Howdy! I am just a %s. Nice to meet you.", this.getType());
    }
}
