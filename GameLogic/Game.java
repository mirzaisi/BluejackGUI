package com.mirzaisi.BluejackGUI.GameLogic;

import com.mirzaisi.BluejackGUI.GameLogic.Decks.GameDeck;
import com.mirzaisi.BluejackGUI.GameLogic.Players.Computer;
import com.mirzaisi.BluejackGUI.GameLogic.Players.Player;
import com.mirzaisi.BluejackGUI.GameLogic.Players.Base.BasePlayer;

public class Game {
    private String playerName;

    public Game(String playerName) {
        this.playerName = playerName;
        createGame();
    }

    private void createGame() {
        GameDeck gameDeck = new GameDeck();
        
        BasePlayer computer = new Computer(gameDeck);
        BasePlayer player = new Player(playerName, gameDeck);
        
    }
}
