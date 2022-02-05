package com.mchekin.designpatterns.adapter;

public class FrenchPersonAdapter implements PersonInterface {

    private final FrenchPerson frenchPerson;

    public FrenchPersonAdapter(FrenchPerson frenchPerson) {

        this.frenchPerson = frenchPerson;
    }

    @Override
    public String getFirstName() {
        return this.frenchPerson.getPrenom();
    }

    @Override
    public String getLastName() {
        return this.frenchPerson.getNom();
    }
}
