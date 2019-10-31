
package LabWork2134.TestEnum2;

public class Card {
    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;                   //масть
        this.cardRank = cardRank;                   //value
    }

    @Override
    public String toString() {
        return "The Card: " + cardRank +  "_" + cardSuit;
    }
}