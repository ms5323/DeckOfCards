package program;

import objects.Deck;

public class CardGame {
    public static void main(String[] args) {
    		Deck deck = new Deck(); 
    		System.out.println("Generating Deck.....");
    		deck.generateDeck();
    		deck.shuffleDeck();
    		deck.showDeck();
    		int NumberOfDeals = 53;//number of times want a card to be dealt
    		for(int i = 1; i<=NumberOfDeals;i++) {
    			deck.dealOneCard();
    			
    		}
    		
    		

    }
}
