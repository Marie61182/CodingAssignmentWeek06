package week06;

// Create the Card class

// create the two fields, Value (2-14), Name (ace of hearts,jack of spades,two clubs,ect)
//create METHODS
/// getters and Setters
/// describe and print the card
/// A lot of this I got from week 05 Lab

public class Card {
	
	//this is where I made the FIELDS per homework instructions
	/// represents (2 - 14)
	// and we set these to PRIVATE to ENCAPSULATE, this restricts the accessibility of the code.
	private int value;

	// this should represent the Name, like ace of hearts
	private String name;
	

	/// This is a CONSTRUCTOR
	//This COSTRUCTUCTOR is used to INTITIALIZE OBJECTS of a CLASS, it has the same name as the CLASS and is INOVOKED when an OBJECT is created using the NEW KEYWORD

	public Card(int value, String name) {
		this.name = name;
		this.value = value;

	}
	
	
	//this Is where the METHODS go
	/// this is where I made the GETTERS and SETTERS, this will make the CARD and DECK CLASS more flexible
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;

	}
	/// This is the DESCRIBE METHOD that will call on to print out info on each card

	public void describe() {
		System.out.println(this.name + "  (value) " + this.value);
	}

}
