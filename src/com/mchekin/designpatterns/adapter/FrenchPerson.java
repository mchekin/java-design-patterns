package com.mchekin.designpatterns.adapter;

public class FrenchPerson {

    private final String prenom;
    private final String nom;

    public FrenchPerson(String prenom, String nom) {

        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }
}
