package com.xml.controller;

import com.xml.model.Card;
import com.xml.model.Cards;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller {

    public ArrayList<Card> loadXml(String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Cards.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            Cards wrapper = (Cards) unmarshaller.unmarshal(new File(filePath));
            ArrayList<Card> cards2 = wrapper.getCards();
            return cards2;
        } catch (Exception e) {
            return null;
        }
    }
    
    public void saveXml(ArrayList<Card> cards, String filePath){
        try {
                JAXBContext context = JAXBContext.newInstance(Cards.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

                Cards wrapper = new Cards();
                wrapper.setCards(cards);

                marshaller.marshal(wrapper, new File(filePath));

            } catch (Exception e) {
                e.printStackTrace();
            }
    }

}
