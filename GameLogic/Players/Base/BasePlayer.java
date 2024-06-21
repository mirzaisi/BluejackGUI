package com.mirzaisi.BluejackGUI.GameLogic.Players.Base;


public class BasePlayer {
    private String name;
    private int roundScore;
    private int gameScore;
    private BasePlayerHand hand;
    private BasePlayerBoard board;


    public BasePlayer(String name) {
        this.name = name;
        this.roundScore = 0;
        this.gameScore = 0;
        this.hand = new BasePlayerHand();
        this.board = new BasePlayerBoard();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoundScore() {
        return roundScore;
    }

    public void setRoundScore(int roundScore) {
        this.roundScore = roundScore;
    }

    public int getGameScore() {
        return gameScore;
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }

    public BasePlayerHand getHand() {
        return hand;
    }

    public void setHand(BasePlayerHand hand) {
        this.hand = hand;
    }

    public BasePlayerBoard getBoard() {
        return board;
    }

    public void setBoard(BasePlayerBoard board) {
        this.board = board;
    }
    
    public void addRoundScore(int score) {
        this.roundScore += score;
    }

    public void addGameScore(int score) {
        this.gameScore += score;
    }
}
