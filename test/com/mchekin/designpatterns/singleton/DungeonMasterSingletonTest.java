package com.mchekin.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DungeonMasterSingletonTest {

    @Test
    void sameInstanceForConsequentGetInstanceCalls() {
        DungeonMasterSingleton dungeonMaster1 = DungeonMasterSingleton.getInstance("John");
        DungeonMasterSingleton dungeonMaster2 = DungeonMasterSingleton.getInstance("Jim");

        assertEquals("John", dungeonMaster1.getName());
        assertEquals("John", dungeonMaster2.getName());
        assertSame(dungeonMaster1, dungeonMaster2);
    }
}