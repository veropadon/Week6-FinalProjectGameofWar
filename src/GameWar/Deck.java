package GameWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Deck {
    private List<Card> cards;
    
    public Deck() {
        cards = new ArrayList<>();
        populateDeck();
    }
    
    private void populateDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] names = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        
        for (String suit : suits) {
            for (int i = 0; i < names.length; i++) {
                String name = names[i] + " of " + suit;
                Card card = new Card(name, i + 2);
                cards.add(card);
            }
        }
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public Card draw() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        } else {
            return null;
        }
    }
}

	


