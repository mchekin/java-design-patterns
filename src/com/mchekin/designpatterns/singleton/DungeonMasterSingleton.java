package com.mchekin.designpatterns.singleton;

public class DungeonMasterSingleton {

    private static volatile DungeonMasterSingleton instance = null;
    private final String name;

    private DungeonMasterSingleton(String name) {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() instead");
        }

        this.name = name;
    }

    public static DungeonMasterSingleton getInstance(String value) {
        if (instance == null) {
            instance = new DungeonMasterSingleton(value);
        }

        return instance;
    }

    public String getName() {
        return name;
    }
}
