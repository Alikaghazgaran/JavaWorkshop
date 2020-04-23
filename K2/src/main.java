import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.MakeCards();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ‌Deck Brand Name: ");
        deck.brandName = scanner.nextLine();
        System.out.println("s for Spades, h for Hearts, d for Diamonds & c for Clubs");
        deck.setCards();
        while (true) {
            System.out.println("\nMENU:\n1\tPrint Cards & Stats\n2\tComplete Info\n3\tShuffle\n4\tSort\n5\tExit");
            int temp = scanner.nextInt();
            switch (temp) {
                case 1:
                    deck.print();
                    deck.stats();
                    break;
                case 2:
                    deck.complete();
                    break;
                case 3:
                    deck.shuffle();
                    deck.print();
                    break;
                case 4:
                    deck.sort();
                    deck.print();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}