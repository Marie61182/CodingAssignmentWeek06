/// War Card Game
//create a new Deck of cards, instantiate
///Shuffle the deck
// Set the players, should be 2
// use traditional loop to iterate 52 times calling the DRAW method on the other player each time
// use a Traditional loop to iterate 26 times and the FLIP method for each player
//compare the VALUE of each card returned by the 2 players FLIP methods, call the increamentScore method on the player whose card has the higher value
//after the LOOP compare the FINAL score 
//print the final score of each player "player 1" , "player 2" or "draw"

///    these are Tips to make the game more interesting
/// try to print info throughout the game, this adds value and makes debugging easier.
/// use Card describe() method when each card is flipped to show the game play
/// printing the "winner" at each turn makes it more interesting
///printing score after each turn shows the game progression






package week06;

public class App {
	
	public static void main(String[]  args) {
	
		
		//Add code here to instantiate a Deck
		
		Deck deck = new Deck();
		System.out.println("New Deck has been created!");
		System.out.println("--------------------------------");
		
	
		
		/// this is where we call the DESCRIBE METHOD on the newly instantiated DECK
		deck.describe();
		
		/// I added a SHUFFLE METHOD in the DECK CLASS to randomize the order
		
		System.out.println("\nShuffled Deck!");
		/// I used the \n here for a new line
		
		System.out.println("----------------------------------");
		deck.shuffle();
		///call the describe method on the newly shuffled deck
		deck.describe();
		
		// Add 2 players
		Player player1= new Player();
		Player player2 = new Player();
		
		// Set player Names
		
		player1.setName("Cheetah");
		player2.setName("Leopard");
		
		// Deal the cards
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 ==0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		System.out.println("\n" + player1.getName() + " has these cards");
		System.out.println("\n" + player2.getName() + " has these cards");
				  
				//// Start the round and play the game
				int round = 1;
				
				// Players play the cards and the score is incremented
				
				for (int i = 0; i < 26; i++) {
					System.out.println("\n --- Round " + round + " of 26 ----");
					round++;
					Card cardOne = player1.flipCard();
					Card cardTwo = player2.flipCard();
					
					System.out.println(player1.getName() + " plays: ");
					cardOne.describe();
					System.out.println(player2.getName() + " plays: ");
					cardTwo.describe();
					
					if (cardOne.getValue1() > cardTwo.getValue1()) {
						player1.incrementScore();
						System.out.println("\n" + player1.getName() + "Wins this Round");
					}else if (cardTwo.getValue1() > cardOne.getValue1()) {
						player2.incrementScore();
						System.out.println("\n" + player2.getName() + "Wins this Round");
					}else {
						System.out.println("It's a Draw");
						
					}
					
				}
				
	}
	
}
						
					
					
	

