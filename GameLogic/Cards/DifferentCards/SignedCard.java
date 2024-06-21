package com.mirzaisi.BluejackGUI.GameLogic.Cards.DifferentCards;

import java.io.File;

import com.mirzaisi.BluejackGUI.GameLogic.Cards.Enums.COLOR_CODES;

public class SignedCard extends ColoredCard{

    public final static String SIGNED_CARDS_FOLDERS = "com\\mirzaisi\\BluejackGUI\\GameFiles\\Textures\\GameCards\\Signed\\";
    private String sign;


    public SignedCard(int number, COLOR_CODES colorCode, File cardFrontPNG, String sign) {
        super(number, colorCode, cardFrontPNG);
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

}
