Card Deck Application
Overview
This is a Java-based console application that simulates a deck of 52 playing cards. The application allows users to create, shuffle, display, compare, search, and deal cards using an interactive menu-driven approach.

Features
Create a deck of 52 standard playing cards.
Display all cards in the deck.
Shuffle the deck randomly.
Print a specific card based on index.
Check if two cards belong to the same suit.
Compare two cards by rank.
Search for a specific card by rank and suit.
Deal 5 random cards from the deck.
Interactive menu-based system for easy user operation.

Class Descriptions
1. Card.java
Represents a single playing card.
Methods:
Card(String rank, String suit): Constructor to initialize a card.
toString(): Returns a string representation of the card.
sameSuit(Card other): Checks if two cards belong to the same suit.
sameRank(Card other): Checks if two cards have the same rank.
2. Deck.java
Manages a collection of 52 cards.
Methods:
createDeck(): Initializes a standard deck of 52 cards.
printDeck(): Prints all the cards in the deck.
printCard(int index): Displays a specific card by index.
sameCard(int idx1, int idx2): Checks if two selected cards have the same suit.
compareCard(int idx1, int idx2): Compares two selected cards by rank.
findCard(String rank, String suit): Searches for a specific card.
dealCard(): Selects and prints 5 random cards from the deck.
shuffleDeck(): Shuffles the deck randomly.
3. Main.java
Implements a menu-driven interface to interact with the deck.
Uses Scanner to take user input and execute selected operations.
