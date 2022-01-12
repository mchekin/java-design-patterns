package com.mchekin.designpatterns.singleton;

public class DungeonMaster {

    private static volatile DungeonMaster instance = null;
    private final String name;

    private DungeonMaster(String name) {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() instead");
        }

        this.name = name;
    }

    public static DungeonMaster getInstance(String value) {
        if (instance == null) {
            instance = new DungeonMaster(value);
        }

        return instance;
    }

    public String getName() {
        return name;
    }
}
