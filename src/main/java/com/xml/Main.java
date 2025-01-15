package com.xml;

import com.xml.controller.Controller;
import com.xml.view.Form;

public class Main {
    public static void main(String[] args) {
        Controller c = new Controller();
        Form f = new Form(c);
        f.setVisible(true);
    }
}