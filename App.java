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



/// Here I create a CLASS called APP which instantiates the DECK and 2 PLAYERS and DRAWS cards for the Players.






package week06;

public class App {
	
	private static String name;

	public static void main(String[]  args) {
		
	
		
		//Add code here to instantiate a Deck
		
		Deck deck = new Deck();
		System.out.println("New Deck has been created!");
		System.out.println("--------------------------------");
		Card card = new Card(0, name);
		
		
	
		
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
		System.out.println( "\n --- War has been Declared ----");
		System.out.println("----------------------------------");
				  
				//// Start the round and play the game
				int round = 1;
				
				// Players play the cards and the score is incremented we use a TRADITIONAL FOR LOOP here to iterate 26 times and CALL THE FLIP METHOD
				
				for (int i = 0; i < 26; i++) {
					System.out.println("\n --- Round " + round + " of 26 ----");
					round++;
					Card cardOne = player1.flipCard();
					Card cardTwo = player2.flipCard();
					
					System.out.print(player1.getName() + " plays: ");
					cardOne.describe();
					System.out.print(player2.getName() + " plays: ");
					cardTwo.describe();
					
					if (cardOne.getValue() > cardTwo.getValue()) {
						player1.incrementScore();
						System.out.println("\n" + player1.getName() + " Wins this Round");
					}else if (cardTwo.getValue() > cardOne.getValue()) {
						player2.incrementScore();
						System.out.println("\n" + player2.getName() + " Wins this Round");
					}else {
						System.out.println("It's a Draw");
						
					}
				System.out.println(player1.getName() + "'s Score is " + player1.getScore() );
				System.out.println(player2.getName() + "'s Score is " + player2.getScore() );
				}
				System.out.println();
				System.out.println("Final Scores");
				System.out.println(player1.getName() + "'s Final Score is " + player1.getScore() );
				System.out.println(player2.getName() + "'s Final Score is " + player2.getScore() );
				if (player1.getScore() > player2.getScore()) {
					System.out.println(player1.getName() + " Wins the Game");
				}else if(player1.getScore() < player2.getScore()) {
					System.out.println(player2.getName() + " Wins the Game");
				}else {
					System.out.println("Nobody Wins the Game of War");
				}
				
	}
	
}
						
					
					
	

