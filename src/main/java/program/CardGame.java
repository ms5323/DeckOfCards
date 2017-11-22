package program;

import objects.Deck;

public class CardGame {
    public static void main(String[] args) {
    		Deck deck = new Deck(); 
    		System.out.println("Printing cards...");
    		deck.generateDeck();
    		System.out.println("Shuffling Cards...");
    		deck.shuffleDeck();
    		deck.showDeck();
    		int NumberOfDeals = 53;//number of times want a card to be dealt
    		for(int i = 1; i<=NumberOfDeals;i++) {
    			deck.dealOneCard();
    			
    		}
    		
    		

    }
}
