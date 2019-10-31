

package LabWork2134.TestEnum2;


public class Main {
    public static void main(String[] args) {
        Card[][] cards = new Card[4][16];

        for (int i = 0; i < Suit.values().length; i++) {

            for (int j = 0; j < Rank.values().length; j++) {
                cards[i][j] = new Card(Suit.values()[i], Rank.values()[j]);
            }
        }
        for (int i = 0; i < Suit.values().length; i++) {

            for (int j = 0; j < Rank.values().length; j++) {
                System.out.println(cards[i][j].toString());
            }
        }
    }
}