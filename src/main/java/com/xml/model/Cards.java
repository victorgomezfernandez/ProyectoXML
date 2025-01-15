package com.xml.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "cards")
public class Cards {

    private ArrayList<Card> cards;

    @XmlElement(name = "card")
    public ArrayList<Card> getCards() {
        return cards;
    }
    
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
