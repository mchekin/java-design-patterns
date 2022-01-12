package com.mchekin.designpatterns.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonsterPrototypeTest {
    @Test
    void cloneMonsters() {
        // creating initial monsters
        Ogre ogre = new Ogre("1");
        Goblin goblin = new Goblin("2");
        Cyclops cyclops = new Cyclops("3");

        // adding monsters to monster registry
        MonsterRegistry.addMonster(ogre);
        MonsterRegistry.addMonster(goblin);
        MonsterRegistry.addMonster(cyclops);

        // cloning monsters
        Monster clonedOgre = MonsterRegistry.getMonster("1");
        Monster clonedGoblin = MonsterRegistry.getMonster("2");
        Monster clonedCyclops = MonsterRegistry.getMonster("3");

        // making assertions
        assertInstanceOf(Ogre.class, clonedOgre);
        assertInstanceOf(Goblin.class, clonedGoblin);
        assertInstanceOf(Cyclops.class, clonedCyclops);

        assertNotSame(ogre, clonedOgre);
        assertNotSame(goblin, clonedGoblin);
        assertNotSame(cyclops, clonedCyclops);

        assertEquals(ogre.greeting(), clonedOgre.greeting());
        assertEquals(goblin.greeting(), clonedGoblin.greeting());
        assertEquals(cyclops.greeting(), clonedCyclops.greeting());
    }

    @Test
    void throwExceptionOnTryingToCloneNonRegisteredMonster() {
        Throwable throwable = assertThrows(RuntimeException.class, () -> MonsterRegistry.getMonster("1"));

        assertEquals("Could not clone monster by id 1.", throwable.getMessage());
    }
}