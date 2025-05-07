package week06;

import java.util.ArrayList;
import java.util.List;

//FIRST  I created a PLAYER CLASS
// THEN Per Homework instructions I created 3 FIELDS 
  // 1.) Hand (this is a list of the cards)
  //  2.) Score ( set to 0 in the CONSTRUCTOR)
  // 3.) Name
// THEN I created METHODS
 // a.) DESCRIBE (this prints out info about the player and calls the describe method for each card in the Hand list
// b.)  FLIP (this removes and returns the top card of the hand)
// c.)  DRAW ( takes a Deck as an argument and calls the Draw Method on the Deck addint the returned Card to the hand field
// d.) INCREMENTSCORE ( this adds 1 to the PLayer's Score field)

public class Player {
	
	// fields
	
	String name;
	int score;
	List<Card> hand = new ArrayList<Card>();
	
	// Constructor
	public Player () {
	}
	
	public Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
	   this.score = 0;
	}
	
	//prints out card info that the player has in their hand
	
	//public void describe() {
	
	public void draw(Deck deck)
	{
		hand.add(deck.draw());
	}
	
	public Card flipCard()
	{
		return hand.remove(0);
	}
	public void incrementScore()
	{
		//increasing after each round
		score++;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
		
		
		
		
		
		
		
	
	
		
		
	
	

	}
	
	
	

}
