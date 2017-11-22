package objects;

import enums.CardSuits;
import enums.CardValues;

public class Card { //constructor for card
	CardValues value;
	CardSuits suit;
	
	public Card(CardValues value, CardSuits suit) {
		this.suit = suit;
		this.value = value;
	}
	
	public CardValues getValue() {
		return value;
	}
	
	public void setValue(CardValues value) {
		this.value = value;
	}
	
	public CardSuits getSuit() {
		return suit;
	}
	
	public void setSuit(CardSuits suit) {
		this.suit = suit;
	}
	
	public String showCard() {
		System.out.println("Card value is " + value + ". " + "Card suit is " + suit + ".");
		return "Card value is " + value + ". " + "Card suit is " + suit + ".";
	}


}
