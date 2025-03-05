// Deck.java
import java.util.*;

class Deck {
    private ArrayList<Card> deck;

    // Constructor to initialize the deck
    public Deck() {
        deck = new ArrayList<>();
        createDeck(); // Automatically creates the deck
    }

    // Method to create a standard deck of 52 cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Method to display all cards in the deck
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Method to print a specific card from the deck by index
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid index! Please enter a number between 0 and " + (deck.size() - 1));
        }
    }

    // Method to check if two cards have the same suit
    public void sameCard(int index1, int index2) {
        if (index1 >= 0 && index1 < deck.size() && index2 >= 0 && index2 < deck.size()) {
            Card card1 = deck.get(index1);
            Card card2 = deck.get(index2);

            if (card1.sameSuit(card2)) {
                System.out.println(card1 + " and " + card2 + " are from the same suit.");
            } else {
                System.out.println(card1 + " and " + card2 + " are from different suits.");
            }
        } else {
            System.out.println("Invalid indexes! Please enter valid card positions.");
        }
    }

    // Method to check if two cards have the same rank
    public void compareCard(int index1, int index2) {
        if (index1 >= 0 && index1 < deck.size() && index2 >= 0 && index2 < deck.size()) {
            Card card1 = deck.get(index1);
            Card card2 = deck.get(index2);

            if (card1.sameRank(card2)) {
                System.out.println(card1 + " and " + card2 + " have the same rank.");
            } else {
                System.out.println(card1 + " and " + card2 + " have different ranks.");
            }
        } else {
            System.out.println("Invalid indexes! Please enter valid card positions.");
        }
    }

    // Method to find a specific card
    public void findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found in the deck.");
    }

    // Method to deal 5 random cards from the deck
    public void dealCard() {
        shuffleDeck();
        System.out.println("Dealing 5 random cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled successfully.");
    }
}
