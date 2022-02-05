package com.mchekin.designpatterns.adapter;

public class GermanPerson {

    private final String vorname;
    private final String nachname;

    public GermanPerson(String vorname, String nachname) {

        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }
}
