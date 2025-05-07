package week06;

// Create the Card class
// create the two fields, Value (2-14), Name (ace of hearts,jack of spades,two clubs,ect)
//create METHODS
/// getters and Setters
/// describe and print the card
/// A lot of this I got from week 05 Lab


public class Card {
	
	String value;
	///  represents (2 - Ace)
	String name;
	// this should represent the suite, like ace of heats
	int value1;
	
	/// I liked what we called this in Week05 lab better ie; suits, names
	
	public Card(String value, String name, int value1) {
		this.name = name;
		this.value = value;
		this.value1 = value1;
		
		
		
	}

	
	

	public Card(Integer numberName, String suit) {
		// TODO Auto-generated constructor stub
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}
	
public void describe() {
	System.out.println(this.name + " of " +  this.value + " --- " + this.value1 );
}
	
}


