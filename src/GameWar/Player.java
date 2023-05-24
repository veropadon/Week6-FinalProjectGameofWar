package GameWar;

import java.util.ArrayList;
import java.util.List;

 class Player {
	
	 public  List<Card> hand;
	 public int score;
	 public String name;
	
	public Player (String name) {
		hand = new ArrayList<>();
		score = 0;
		this.name = name;
		
	}

	
	public void describe() {
	
 System.out.println("Player: " + this.name);
  for (Card card : hand) {
		card.describe();
  }
	}
	


	

public Card flip () {
	  return hand.remove(0); // Return null if hand is empty */
	
	
}

public void draw(Deck deck) {
    hand.add(deck.draw());
	}



public void incrementScore() {


score++;

}

public int getScore() {
    return score;
}
}




