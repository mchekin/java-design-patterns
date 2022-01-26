package com.mchekin.designpatterns.abstractfactory;

public class Application {
    private final AnimalFactory factory;

    public Application(AnimalFactory factory) {

        this.factory = factory;
    }

    public String rhinoGreeting()
    {
        return this.factory.createRhino().raiseHorn();
    }

    public String elephantGreeting()
    {
        return this.factory.createElephant().trumpet();
    }
}
