package com.mchekin.designpatterns.prototype;

public abstract class Monster implements Cloneable {
    private final String id;
    private final String type;

    public Monster(String id, String type) {
        this.id = id;
        this.type = type;
    }

    abstract String greeting();

    @Override
    public Monster clone() {
        try {
            return (Monster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
