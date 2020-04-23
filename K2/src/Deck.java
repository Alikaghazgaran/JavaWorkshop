import java.util.Random;
import java.util.Scanner;

public class Deck {
    public String brandName;
    Card[] card = new Card[52];
    public void MakeCards() {
        for (int i=0 ; i<52 ; i++)
            card[i] = new Card();
    }
    public void setCards() {
        Scanner scanner = new Scanner(System.in);
        for (int i=0 ; i<52 ; i++) {
            System.out.print("Enter " +  (i+1) + "th Card's Value: ");
            card[i].value = scanner.nextLine();
            System.out.print("Color: ");
            card[i].color = scanner.nextLine();
            System.out.print("Symbol: ");
            card[i].symbol = scanner.nextLine();
        }
    }
    public void print() {
        System.out.println();
        for (int i=0 ; i<52 ; i++)
            System.out.println((i+1) + "th Card's Value: " + card[i].value + "\nColor: " + card[i].color + "\nSymbol: " + card[i].symbol);
    }
    public void stats() {
        int x = 0;
        for (int i=0 ; i<52 ; i++)
            if (card[i].value.equals("") || card[i].color.equals("") || card[i].symbol.equals(""))
                x++;
        System.out.println("\nComplete Cards: " + (52-x) + "\nIncomplete Cards: " + x);
    }
    public void complete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        for (int i=0 ; i<52 ; i++) {
            if (card[i].value.equals("")) {
                System.out.print("Enter " +  (i+1) + "th Card's Value: ");
                card[i].value = scanner.nextLine();
            }
            if (card[i].color.equals("")) {
                System.out.print("Enter " +  (i+1) + "th Card's Color: ");
                card[i].color = scanner.nextLine();
            }
            if (card[i].symbol.equals("")) {
                System.out.print("Enter " +  (i+1) + "th Card's Symbol: ");
                card[i].symbol = scanner.nextLine();
            }
        }
    }
    public void swap(int i, int j) {
        Card temp = card[i];
        card[i] = card[j];
        card[j] = temp;
    }
    public void shuffle() {
        Random random = new Random();
        for (int i=0; i<52; i++) {
            int ran = random.nextInt(52);
            swap(i, ran);
        }
    }
    public void symbolSort() {
        for (int i=0; i<52; i++)
            for (int j=i+1; j<52; j++)
                if (card[i].symbol.compareTo(card[j].symbol) > 0)
                    swap(i, j);
    }
    public int count(String s) {
        int x = 0;
        for (int i=0 ; i<52 ; i++)
            if (card[i].symbol.equals(s))
                x++;
        return x;
    }
    public void cardSort(int i, int x) {
        for (; i>x ; i--)
            for (int j=i-1; j>x; j--)
                if (card[i].value.equals("") || card[j].value.equals("")) {
                }
                else if (Integer.valueOf(card[i].value).compareTo(Integer.valueOf(card[j].value)) < 0)
                    swap(i, j);
    }
    public void sort() {
        symbolSort();
        int c=count("c") , d=count("d"), h=count("h"), s=count("s"), x=51, i=51;
        x -= s;
        cardSort(i, x);
        i = x;
        x -= h;
        cardSort(i, x);
        i = x;
        x -= d;
        cardSort(i, x);
        i = x;
        x -= c;
        cardSort(i, x);
    }
}