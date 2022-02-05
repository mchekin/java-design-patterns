package com.mchekin.designpatterns.adapter;

public class Client {
    private final PersonInterface person1;
    private final PersonInterface person2;

    public Client(PersonInterface person1, PersonInterface person2) {

        this.person1 = person1;
        this.person2 = person2;
    }

    public PersonInterface getPerson1() {
        return person1;
    }

    public PersonInterface getPerson2() {
        return person2;
    }
}
