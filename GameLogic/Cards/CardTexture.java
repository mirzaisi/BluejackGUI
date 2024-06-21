package com.mirzaisi.BluejackGUI.GameLogic.Cards;

import java.awt.image.BufferedImage;

public class CardTexture {
    private BufferedImage cardFront;
    private BufferedImage cardBack;
     
    public CardTexture(BufferedImage cardFront, BufferedImage cardBack) {
        this.cardFront = cardFront;
        this.cardBack = cardBack;
    }

    public BufferedImage getCardFront() {
        return cardFront;
    }

    public void setCardFront(BufferedImage cardFront) {
        this.cardFront = cardFront;
    }

    public BufferedImage getCardBack() {
        return cardBack;
    }

    public void setCardBack(BufferedImage cardBack) {
        this.cardBack = cardBack;
    }

    
}
