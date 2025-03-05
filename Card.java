// Card.java
class Card {
    private String rank;
    private String suit;

    // Constructor to initialize rank and suit
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getter methods
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    // Method to check if two cards belong to the same suit
    public boolean sameSuit(Card other) {
        return this.suit.equals(other.suit);
    }

    // Method to compare two cards by rank
    public boolean sameRank(Card other) {
        return this.rank.equals(other.rank);
    }

    // Convert card to string format
    public String toString() {
        return rank + " of " + suit;
    }
}
