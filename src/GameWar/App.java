package GameWar;



public class App {

	public static void main(String[] args) {
		
		 System.out.println(" Game WAR : ");
		
		
	//	For the final project you will be creating an automated version of the classic card game WAR.
	//	1.	Create the following classes:
	//	a.	Card
	//	i.	Fields
	//	1.	value (contains a value from 2-14 representing cards 2-Ace)
	//	2.	name (e.g. Ace of Diamonds, or Two of Hearts)
	//	ii.	Methods
	//	1.	Getters and Setters
	//	2.	describe (prints out information about a card).

		
	




// b.	Deck
// i.	Fields
// 1.	cards (List of Card)
// ii.	Methods
// 1.	shuffle (randomizes the order of the cards)
// 2.	draw (removes and returns the top card of the Cards field)
// 3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.



// Add your code here to instantiate a Deck	

//c.	Player
//i.	Fields
//1.	hand (List of Card)
//2.	score (set to 0 in the constructor)
//3.	name
//ii.	Methods
//1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
//2.	flip (removes and returns the top card of the Hand)
//3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
//4.	incrementScore (adds 1 to the Player’s score field)



// 2.	Create a class called App with a main method.
// a)	Instantiate a Deck and two Players, call the shuffle method on the deck.
// b)	Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
// c)	Using a traditional for loop, iterate 26 times and call the flip method for each player.
// d)	Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
// e)	After the loop, compare the final score from each player. 
// f)	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.

		
		

Deck deck = new Deck();



Player player1 = new Player("Player 1");
Player player2 = new Player("Player 2");

// Draw cards
for (int i = 0; i < 52; i++) {
    player1.draw(deck);
    player2.draw(deck);
}


// Play the game
for (int i = 0; i < 26; i++) {
    Card player1Card = player1.flip();
    Card player2Card = player2.flip();
    player1Card.describe();
    player2Card.describe();

 
   
 

    //  Describe the cards & Compare the cards and increment score
    if (player1Card.getValue() > player2Card.getValue()) {
        System.out.println("Player 1 wins this round!");
        player1.incrementScore();
    } else if (player1Card.getValue() < player2Card.getValue()) {
        System.out.println("Player 2 wins this round!");
        player2.incrementScore();
    } else {
        System.out.println("It's a draw for this round");
    }

    // Show game progression
    System.out.println("Score: Player 1 - " + player1.getScore() + ", Player 2 - " + player2.getScore());
    
    		
		
	}

if (player1.getScore() > player2.getScore()) {
    System.out.println("Player 1 wins the game");
} else if (player1.getScore() < player2.getScore()) {
    System.out.println("Player 2 wins the game");
} else {
    System.out.println("It's a draw");
}

System.out.println("Final Score: Player 1 - " + player1.getScore() + ", Player 2 - " + player2.getScore());
}

	}


