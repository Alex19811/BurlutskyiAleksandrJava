package LabWork2134.TestEnum2;

public class Card {
    private Main.Suit cardSuit;
    private Main.Rank cardRank;

    public Card(Main.Suit cardSuit, Main.Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardSuit=" + cardSuit +
                ", cardRank=" + cardRank +
                '}';
    }

}

/*
public class Card {
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    Card() {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }


}
*/
