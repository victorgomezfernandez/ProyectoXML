package com.xml.model;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "card")
public class Card implements Serializable {

    private String name;
    private String type;
    private String set;

    public Card() {

    }

    public Card(String name, String type, String set) {
        this.name = name;
        this.type = type;
        this.set = set;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement
    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

}
