package com.mirzaisi.BluejackGUI.GameLogic.Players.Base;

import java.util.ArrayList;

import com.mirzaisi.BluejackGUI.GameLogic.Cards.Card;

public class BasePlayerHand {
    private ArrayList<Card> cardsInHand;

    public BasePlayerHand() {
        this.cardsInHand = new ArrayList<Card>();
    }

    public ArrayList<Card> getCardsInHand() {
        return cardsInHand;
    }

    public void setCardsInHand(ArrayList<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }
}
