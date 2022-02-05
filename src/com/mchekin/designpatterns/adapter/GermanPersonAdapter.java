package com.mchekin.designpatterns.adapter;

public class GermanPersonAdapter implements PersonInterface {

    private final GermanPerson germanPerson;

    public GermanPersonAdapter(GermanPerson germanPerson) {

        this.germanPerson = germanPerson;
    }

    @Override
    public String getFirstName() {
        return this.germanPerson.getVorname();
    }

    @Override
    public String getLastName() {
        return this.germanPerson.getNachname();
    }
}
