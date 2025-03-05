// Main.java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        int choice;

        do {
            System.out.println("\n===== CARD DECK MENU =====");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Specific Card");
            System.out.println("3. Check if Two Cards Have Same Suit");
            System.out.println("4. Compare Two Cards by Rank");
            System.out.println("5. Find a Specific Card");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter index of card (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 3:
                    System.out.print("Enter first card index (0-51): ");
                    int index1 = scanner.nextInt();
                    System.out.print("Enter second card index (0-51): ");
                    int index2 = scanner.nextInt();
                    deck.sameCard(index1, index2);
                    break;
                case 4:
                    System.out.print("Enter first card index (0-51): ");
                    int index3 = scanner.nextInt();
                    System.out.print("Enter second card index (0-51): ");
                    int index4 = scanner.nextInt();
                    deck.compareCard(index3, index4);
                    break;
                case 5:
                    System.out.print("Enter rank (e.g., A, 2, 10, J, Q, K): ");
                    String rank = scanner.next();
                    System.out.print("Enter suit (Hearts, Clubs, Diamonds, Spades): ");
                    String suit = scanner.next();
                    deck.findCard(rank, suit);
                    break;
                case 6:
                    deck.dealCard();
                    break;
                case 7:
                    deck.shuffleDeck();
                    break;
                case 8:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 8.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
