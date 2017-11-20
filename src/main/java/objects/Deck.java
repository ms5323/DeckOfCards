package objects;

import java.util.ArrayList;
import java.util.Collections;

import enums.CardSuits;
import enums.CardValues;

public class Deck {
	private ArrayList<Card> Cards;	
	private int numCards;
	
	public Deck() {
		Cards = new ArrayList<Card>();
		numCards = 0;
		
	}
	public void generateDeck(){
		System.out.println("Creating new deck...");
		Cards.clear();
		
		for(CardSuits suits : CardSuits.values()) {
			for(CardValues values : CardValues.values()) {
				Card card = new Card(values,suits);
				Cards.add(card);
				
			}
		}
		numCards = 52;
	}
	
	public void shuffleDeck() {
		System.out.println("Shuffling Cards...");
		Collections.shuffle(Cards);
	}
	
	public Card dealOneCard(){
		Card deal = Cards.get(Cards.size()-1);
		System.out.println("Dealing one card...");
		deal.showCard();
		Cards.remove(Cards.size()-1);
		numCards = numCards - 1;
		return deal;
	}
	public void showDeck() {
		if(numCards == 0) {
			System.out.println("No more cards are left");
		}else {
			System.out.println("Deck has " + numCards + " left.");
			System.out.println("Printing cards...");
			for(int i = 0; i < Cards.size()-1; i++) {
				Cards.get(i).showCard();
			}
		}
	}
}
