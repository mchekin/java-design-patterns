package com.mchekin.designpatterns.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalAbstractFactoryTest {
    @Test
    public void africanAnimalsGreetings() {

        Application application = new Application(new AfricanAnimalFactory());

        assertEquals("African elephant trumpets.", application.elephantGreeting());
        assertEquals("African rhino raises horn.", application.rhinoGreeting());
    }

    @Test
    public void asianAnimalsGreetings() {

        Application application = new Application(new AsianAnimalFactory());

        assertEquals("Asian elephant trumpets.", application.elephantGreeting());
        assertEquals("Asian rhino raises horn.", application.rhinoGreeting());
    }
}