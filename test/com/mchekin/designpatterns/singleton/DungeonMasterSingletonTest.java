package com.mchekin.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DungeonMasterSingletonTest {

    @Test
    void sameInstanceForConsequentGetInstanceCalls() {
        DungeonMasterSingleton sut1 = DungeonMasterSingleton.getInstance("John");
        DungeonMasterSingleton sut2 = DungeonMasterSingleton.getInstance("Jim");

        assertEquals("John", sut1.getName());
        assertEquals("John", sut2.getName());
        assertSame(sut1, sut2);
    }
}