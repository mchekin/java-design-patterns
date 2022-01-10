package com.mchekin.designpatterns.prototype;

import java.util.Hashtable;

public class MonsterRegistry {

    private static final Hashtable<String, Monster> monsterMap = new Hashtable<>();

    public static Monster getMonster(String monsterId) {
        try {
            Monster cachedMonster = monsterMap.get(monsterId);

            return cachedMonster.clone();
        } catch (Throwable throwable) {
            throw new RuntimeException(String.format("Could not clone monster by id %s.", monsterId));
        }
    }

    public static void addMonster(Monster monster) {
        monsterMap.put(monster.getId(), monster);
    }
}
