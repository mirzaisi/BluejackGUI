package com.mirzaisi.BluejackGUI.GameLogic.Decks.DifferentDecks;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Collections;

import com.mirzaisi.BluejackGUI.GUI.GraphicInterfaces.Prompt;
import com.mirzaisi.BluejackGUI.GameLogic.Cards.DifferentCards.ColoredCard;
import com.mirzaisi.BluejackGUI.GameLogic.Cards.Enums.COLORED_FOLDERS;
import com.mirzaisi.BluejackGUI.GameLogic.Cards.Enums.COLOR_CODES;
import com.mirzaisi.BluejackGUI.GameLogic.Cards.Card;

public class GameDeck {
    private List<Card> deck;

    public final static String COLORED_CARDS_FRONT_FOLDERS = "com\\mirzaisi\\BluejackGUI\\GameFiles\\Textures\\GameCards\\Colored\\";

    private final int DECK_SIZE = 40;
    private final int DECK_SIZE_PER_COLOR = 10;

    public GameDeck() {
        generateGameDeck();
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    private void generateGameDeck() {
        
        for (int i = 0; i < DECK_SIZE / DECK_SIZE_PER_COLOR; i++) {
            for (int j = 1; j <= DECK_SIZE_PER_COLOR; j++) {
                Path coloredFolder = Paths.get(COLORED_CARDS_FRONT_FOLDERS, COLORED_FOLDERS.values()[i].toString());
                Path cardFrontFilePath = Paths.get(coloredFolder.toString(),
                                                    COLOR_CODES.values()[i].toString(), 
                                                    String.valueOf(j),  ".png");

                String cardFrontFilePathString = cardFrontFilePath.toString();
                deck.add(new ColoredCard(j, COLOR_CODES.values()[i], new File(cardFrontFilePathString)));
            }
        }

        new Prompt("Game Deck generated!");
        shuffleDeck();
    }

    private void shuffleDeck() {
        Collections.shuffle(deck);
        new Prompt("Game Deck shuffled!");
    }
    
    public Card drawCardFromGameDeck(boolean drawFromTop) {
        int drawIndex = 0;
        if (drawFromTop) {
            drawIndex = deck.size() - 1;
        }
        Card card = deck.get(drawIndex);
        deck.remove(drawIndex);
        return card;
    }
}
