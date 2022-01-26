package com.mchekin.designpatterns.abstractfactory;

public class AfricanElephant implements Elephant {
    @Override
    public String trumpet() {
        return "African elephant trumpets.";
    }
}
