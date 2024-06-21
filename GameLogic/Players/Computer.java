package com.mirzaisi.BluejackGUI.GameLogic.Players;

import com.mirzaisi.BluejackGUI.GameLogic.Decks.BaseDeck;
import com.mirzaisi.BluejackGUI.GameLogic.Decks.DifferentDecks.ComputerDeck;
import com.mirzaisi.BluejackGUI.GameLogic.Decks.DifferentDecks.GameDeck;
import com.mirzaisi.BluejackGUI.GameLogic.Players.Base.BasePlayer;

public class Computer extends BasePlayer{
    private BaseDeck computerDeck;

    private final static String COMPUTER_NAME = "Computer";

    public Computer(GameDeck gameDeck) {
        super(COMPUTER_NAME);
        this.computerDeck  = new ComputerDeck(gameDeck);
    }

    public BaseDeck getComputerDeck() {
        return computerDeck;
    }

    public void setComputerDeck(BaseDeck computerDeck) {
        this.computerDeck = computerDeck;
    }


}
