package com.mirzaisi.BluejackGUI.GameLogic.Players;

import com.mirzaisi.BluejackGUI.GameLogic.Decks.BaseDeck;
import com.mirzaisi.BluejackGUI.GameLogic.Decks.GameDeck;
import com.mirzaisi.BluejackGUI.GameLogic.Decks.PlayerDeck;
import com.mirzaisi.BluejackGUI.GameLogic.Players.Base.BasePlayer;

public class Player extends BasePlayer{
    private BaseDeck playerDeck;

    public Player(String name, GameDeck gameDeck) {
        super(name);
        this.playerDeck = new PlayerDeck(gameDeck);
    }

    public BaseDeck getPlayerDeck() {
        return playerDeck;
    }

    public void setPlayerDeck(BaseDeck playerDeck) {
        this.playerDeck = playerDeck;
    }

}
