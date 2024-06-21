package com.mirzaisi.BluejackGUI.GameLogic.Cards.DifferentCards;

import java.io.File;
import com.mirzaisi.BluejackGUI.GameLogic.Cards.Card;
import com.mirzaisi.BluejackGUI.GameLogic.Cards.Enums.COLOR_CODES;

public class ColoredCard extends Card{
    private int number;
    private COLOR_CODES colorCode;

    public ColoredCard(int number, COLOR_CODES colorCode, File cardFrontPNG) {
        super(cardFrontPNG);
        this.number = number;
        this.colorCode = colorCode;
    }

    public int getNumber() {
        return number;
    }

    public COLOR_CODES getColorCode() {
        return colorCode;
    }

}
