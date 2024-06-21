package com.mirzaisi.BluejackGUI.GameLogic.Cards.DifferentCards;

import java.io.File;

import com.mirzaisi.BluejackGUI.GameLogic.Cards.Card;

public class SpecialCard extends Card{

    public final static String SPECIAL_CARDS_FOLDERS = "com\\mirzaisi\\BluejackGUI\\GameFiles\\Textures\\GameCards\\Special\\";

    private String specialIndicator;

    public SpecialCard(File cardFrontPNG, String specialIndicator) {
        super(cardFrontPNG);
        this.specialIndicator = specialIndicator;
    }

    public String getSpecialIndicator() {
        return specialIndicator;
    }

}
