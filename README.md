# Week6-FinalProjectGameofWar
WAR Card Game


The WAR Card Game is an automated version of the classic card game "WAR." It is implemented in Java and allows two players to compete against each other by flipping cards and comparing their values. 
The player with the higher card value wins the round and earns a point. At the end of the game, the player with the most points is declared the winner.

Classes
The project consists of the following classes:

Card: Represents a playing card with a value and a name. It provides methods to get and set the card's value and name, as well as a describe method to print information about the card.

Deck: Represents a deck of cards. It has methods to shuffle the deck and draw the top card. The deck is initialized with the standard 52 cards when instantiated.

Player: Represents a player in the game. Each player has a hand of cards, a score, and a name. The Player class provides methods to describe the player and their hand, flip a card from the hand, 
draw a card from the deck, and increment the score.

App: Contains the main method to run the game. It instantiates a deck and two players, shuffles the deck, and proceeds with the gameplay. It iterates through rounds, flipping cards, comparing their values, and updating the scores. 
At the end of the game, it displays the final scores and declares the winner.
