package com.mchekin.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DungeonMasterSingletonTest {

    @Test
    void sameInstanceForConsequentGetInstanceCalls() {
        DungeonMaster dungeonMaster1 = DungeonMaster.getInstance("John");
        DungeonMaster dungeonMaster2 = DungeonMaster.getInstance("Jim");

        assertEquals("John", dungeonMaster1.getName());
        assertEquals("John", dungeonMaster2.getName());
        assertSame(dungeonMaster1, dungeonMaster2);
    }
}