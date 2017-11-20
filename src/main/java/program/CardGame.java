package program;

import objects.Deck;

public class CardGame {
    public static void main(String[] args) {
    		Deck deck = new Deck();
    		deck.generateDeck();
    		deck.shuffleDeck();
    		deck.showDeck();
    		deck.dealOneCard();
    		deck.dealOneCard();
    		deck.dealOneCard();
    		deck.dealOneCard();
    		deck.dealOneCard();
    		deck.dealOneCard();
    		

    }
}
