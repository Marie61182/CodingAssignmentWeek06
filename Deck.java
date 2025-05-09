package week06;

// Create Deck Class
//Create FIELDS a) cards ( this is a list of the cards )
///then create METHODS
   // Shuffle
   // DRAW
   // in the CONSTRUCTOR when a new Deck is instantiated the Cards field should be populated with the standard 52 cards


//// This is the CLASS called DECK I created, this basically creates a list of the cards suits and values

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//// this is the FIELD "CARD" which is a List of Card

public class Deck {
List<Card> cards = new ArrayList<Card>();
String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	
	 public Deck() {
		
		
		////
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			int count = 2;
			for (String numberName : numbers) {
				String name = numberName + " of " + suit;
				cards.add(new Card(count, suit));
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
	
	/// here we CALL COLLECTIONS.SHUFFLE METHOD, this is a SHUFFLE Method in the COLLCTIONS CLASS, in Java Util, these are prebuilt tools available to us
	
	public void shuffle() {
		Collections.shuffle(cards);
		
		
	}
	/// here is our DRAW METHOD which means we are removing and returning the top card of the Cards field
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
		
	}
}


