package com.mchekin.designpatterns.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonAdapterTest {
    @Test
    public void persons() {

        FrenchPerson frenchPerson = new FrenchPerson("Gustave", "Flaubert");
        GermanPerson germanPerson = new GermanPerson("Hermann", "Hesse");

        FrenchPersonAdapter frenchPersonAdapter = new FrenchPersonAdapter(frenchPerson);
        GermanPersonAdapter germanPersonAdapter = new GermanPersonAdapter(germanPerson);

        Client client = new Client(
                frenchPersonAdapter,
                germanPersonAdapter
        );

        assertEquals("Gustave", client.getPerson1().getFirstName());
        assertEquals("Flaubert", client.getPerson1().getLastName());

        assertEquals("Hermann", client.getPerson2().getFirstName());
        assertEquals("Hesse", client.getPerson2().getLastName());
    }
}