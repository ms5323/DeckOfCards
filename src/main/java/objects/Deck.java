import java.util.ArrayList;
import java.util.Collections;

import enums.CardSuits;
import enums.CardValues;

public class Deck {
	private ArrayList<Card> Cards;	
	private int numCards;
	
	public Deck() {
		Cards = new ArrayList<Card>(); //creates an empty deck of cards
		numCards = 0;
		
	}
	public void generateDeck(){//creates the deck
	
		Cards.clear(); // emptys deck
		
		for(CardSuits suits : CardSuits.values()) {
			for(CardValues values : CardValues.values()) {
				Card card = new Card(values,suits);//creates a card with a value and suit
				Cards.add(card);//adds card to the arraylist
				
			}
		}
		numCards = 52;
	}
	
	public void shuffleDeck() {
		System.out.println("Shuffling Cards...");
		Collections.shuffle(Cards); //shuffles the deck. 
	}
	
	public Card dealOneCard(){
		if(Cards.size() == 0) {
			System.out.println("No cards are left"); //if all cards are dealt, user gets this message
			return null;
		}
		System.out.println("Dealing one card...");
		Card deal = Cards.get(Cards.size()-1);//gets the last card
		deal.showCard();
		Cards.remove(Cards.size()-1);//removes the cards shown from deck
		System.out.println("there is " + Integer.toString(Cards.size())+ " card remaining in deck");
		return deal; //deals one card
	}
	public void showDeck() {

			System.out.println("Printing cards...");
			for(int i = 0; i < Cards.size()-1; i++) {
				Cards.get(i).showCard(); //prints each card in deck
			}
		}
	}

