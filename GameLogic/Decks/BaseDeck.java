package com.mirzaisi.BluejackGUI.GameLogic.Decks;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

import com.mirzaisi.BluejackGUI.GameLogic.Cards.DifferentCards.ColoredCard;
import com.mirzaisi.BluejackGUI.GameLogic.Cards.DifferentCards.SignedCard;
import com.mirzaisi.BluejackGUI.GameLogic.Cards.DifferentCards.SpecialCard;
import com.mirzaisi.BluejackGUI.GameLogic.Cards.Enums.COLORED_FOLDERS;
import com.mirzaisi.BluejackGUI.GameLogic.Cards.Enums.COLOR_CODES;
import com.mirzaisi.BluejackGUI.GameLogic.Cards.Card;

public class BaseDeck {
    private final int CARD_FROM_GAME_DECK_COUNT = 5;
    private final int SIGNED_CARDS_TO_RANDOMLY_GENERATE = 3;
    private final int SPECIAL_CARDS_TO_RANDOMLY_GENERATE = 2;

    private ArrayList<Card> baseDeck;
    private boolean drawFromTop;
    private GameDeck gameDeck;

    public BaseDeck(GameDeck gameDeck, boolean drawFromTop) {
        this.gameDeck = gameDeck;
        this.drawFromTop = drawFromTop;
        generateDeck();
    }

    protected void generateDeck() {
        drawFromGameDeck();
        randomlyGenerate();

    }

    private void drawFromGameDeck() {
        for (int i = 0; i < CARD_FROM_GAME_DECK_COUNT; i++) {
            Card cardFromGameDeck = gameDeck.drawCardFromGameDeck(drawFromTop);
            baseDeck.add(cardFromGameDeck);
        } 
    }

    private void randomlyGenerate() {
        generateSignedCards();
        generateSpecialCards();

    }

    private void generateSignedCards() {
        for (int i = 0; i < SIGNED_CARDS_TO_RANDOMLY_GENERATE; i++) {
            generateSignedCard();
        }
    }

    private void generateSignedCard() {
        int randomSignedCardNumber = generateRandomSignedCardNumber();
        COLOR_CODES randomSignedCardColorCode = generateRandomSignedCardColorCode();
        String randomSignedCardSign = generateRandomSignedCardSign();

        String cardFrontPNGPath = findSignedCardFrontPNGPath(randomSignedCardNumber, randomSignedCardColorCode, randomSignedCardSign);

        ColoredCard randomlyGeneratedCard = new SignedCard(randomSignedCardNumber, randomSignedCardColorCode, new File(cardFrontPNGPath), 
                                                    randomSignedCardSign);
        baseDeck.add(randomlyGeneratedCard);
    }

    private int generateRandomSignedCardNumber() {
        Random rand = new Random();
        return rand.nextInt(5) + 1;
    } 

    private COLOR_CODES generateRandomSignedCardColorCode() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(COLOR_CODES.values().length);
        return COLOR_CODES.values()[randomIndex];
    } 

    private String generateRandomSignedCardSign() {
        Random rand = new Random();
        String sign = "";
        if (rand.nextInt(100) <= 50) {
            sign = "-";
        } else {
            sign = "+";
        }

        return sign;
    } 

    private String findSignedCardFrontPNGPath(int randomSignedCardNumber, COLOR_CODES randomSignedColorCode, String randomSignedNumberSign) {
        String PNGName = randomSignedColorCode + String.valueOf(randomSignedCardNumber) + randomSignedNumberSign;
        Path pathToPNG = Paths.get(SignedCard.SIGNED_CARDS_FOLDERS, randomSignedNumberSign, 
                                    COLORED_FOLDERS.values()[COLOR_CODES.valueOf(randomSignedNumberSign).ordinal()].toString(), 
                                    randomSignedColorCode.toString(), PNGName,  ".png");

        return pathToPNG.toString();
    }

    private void generateSpecialCards() {
        for (int i = 0; i < SPECIAL_CARDS_TO_RANDOMLY_GENERATE; i++) {
            if (isLucky()) {
                generateSpecialCard();
            } else {
                generateSignedCard();
            }
            
        }
    }

    private void generateSpecialCard() {
        String specialCardIndicator = chooseSpecialCardToGenerate();
        File specialCardFrontPNG = findSpecialCardFrontPNGPath(specialCardIndicator);

        Card randomlyGeneratedCard = new SpecialCard(specialCardFrontPNG, specialCardIndicator);
        baseDeck.add(randomlyGeneratedCard);
    }



    private boolean isLucky() {
        Random rand = new Random();
        if (rand.nextInt(100) >= 80) {
            return true;
        } else {
            return false;
        }
    }

    private String chooseSpecialCardToGenerate() {
        Random rand = new Random();
        if (rand.nextInt(100) <= 50) {
            return "-_+";
        } else {
            return "x2";
        }
    }

    private File findSpecialCardFrontPNGPath(String specialCardIndicator) {
        Path path = Paths.get(SpecialCard.SPECIAL_CARDS_FOLDERS, specialCardIndicator, ".png");
        return new File(path.toString());
    }
    
}
