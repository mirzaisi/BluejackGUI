package com.mirzaisi.BluejackGUI.GameLogic.Players.Base;

import java.util.ArrayList;

import com.mirzaisi.BluejackGUI.GameLogic.Cards.Card;


public class BasePlayerBoard {
    private ArrayList<Card> cardsOnBoard;
    
    public BasePlayerBoard() {
        this.cardsOnBoard = new ArrayList<Card>();
    }

    public ArrayList<Card> getCardsOnBoard() {
        return cardsOnBoard;
    }

    public void setCardsOnBoard(ArrayList<Card> cardsOnBoard) {
        this.cardsOnBoard = cardsOnBoard;
    }

    
}
