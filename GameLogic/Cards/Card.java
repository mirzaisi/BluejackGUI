package com.mirzaisi.BluejackGUI.GameLogic.Cards;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Card {

    public final static String CARD_BACK_FILE_PNG_PATH = "com\\mirzaisi\\BluejackGUI\\GameFiles\\Textures\\GameCards\\CardBackside.png";

    private CardTexture texture;
    private File cardFrontPNG;
    private File cardBackPNG;

    public Card(File cardFrontPNG) {
        this.cardFrontPNG = cardFrontPNG;
        this.cardBackPNG = new File(CARD_BACK_FILE_PNG_PATH);
        this.texture = loadCardTexture(cardFrontPNG, cardBackPNG);
    }

    public CardTexture getTexture() {
        return texture;
    }

    public void setTexture(CardTexture texture) {
        this.texture = texture;
    }

    public File getCardFrontPNG() {
        return cardFrontPNG;
    }

    public void setCardFrontPNG(File cardFrontPNG) {
        this.cardFrontPNG = cardFrontPNG;
    }

    private CardTexture loadCardTexture(File cardFrontPNG, File cardBackPNG){
        try {
            BufferedImage cardFront = ImageIO.read(cardFrontPNG);
            BufferedImage cardBack = ImageIO.read(cardBackPNG);
            
            return new CardTexture(cardFront, cardBack);
        } catch (Exception e) {
            throw new RuntimeException("Error loading card texture");
        }

    }
}
