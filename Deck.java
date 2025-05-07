package week06;

// Create Deck Class
//Create FIELDS a) cards ( this is a list of the cards )
///then create METHODS
   // Shuffle
   // DRAW
   // in the CONSTRUCTOR when a new Deck is instantiated the Cards field should be populated with the standard 52 cards

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
List<Card> cards = new ArrayList<Card>();
String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	
	Deck() {
		
		
		//// at 1st attempt I copied and pasted this from week 5 lab but then I figured I needed to change from String to Int. and change "two" to "2"
		int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		for (String suit : suits) {
			int count = 2;
			for (Integer numberName : numbers) {
				cards.add(new Card(numberName, suit));
				count++;
				
			}
		}
			
		
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
		
		
	}
	/// here is our DRAW METHOD which means we are removing and returning the top card of the Cards field
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
		
	}
}


