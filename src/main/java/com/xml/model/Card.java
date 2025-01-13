package com.xml.model;

public class Card {
    String name;
    String type;
    String set;

    public Card(String name, String type, String set) {
        this.name = name;
        this.type = type;
        this.set = set;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }
}
