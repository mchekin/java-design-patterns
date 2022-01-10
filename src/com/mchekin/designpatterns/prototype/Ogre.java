package com.mchekin.designpatterns.prototype;

public class Ogre extends Monster {

    public Ogre(String id) {
        super(id, "Ogre");
    }

    @Override
    String greeting() {
        return String.format("I am strong because I am an %s!", this.getType());
    }
}
