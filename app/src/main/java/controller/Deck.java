package controller;

import java.util.LinkedList;

import model.Card;

public class Deck {
    private LinkedList<Card> cardList;
    Deck(int nbBox){

    }

    Deck(){

    }

    public Card draw(){
        return cardList.pollFirst();
    }

    @Override
    public String toString() {
        return "";
    }
}
