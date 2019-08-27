
package LabWork2134.TestEnum2;

import com.sun.prism.impl.ps.CachingShapeRep;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public enum Suit {SPADE, DIAMOND, CLUB, HEART}

    public enum Rank {ACE, TWO, THREE, FOUR, FIX, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

    public static void main(String[] args) {

//        List<Card> cards = new ArrayList<Card>( );
//
//        Rank[] ranks = Rank.values();
//        Suit[] suits = Suit.values();

        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                Card c = new Card(s, r);
                //System.out.println(c);
            }
        }
    }
}








      /*  int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        // Display the all the cards
        for (int i = 0; i < 52; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println(rank + " of " + suit);
        }
    }*/

//        array card = new Card() {
//        }
//        for (Suit a : Suit.values()) {
//            for (Rank b : Rank.values()) {
//
//                //System.out.println(i + j);
//
//                String[][] card = new String[4][13];
//
//                array[0][0] = 1;
//                array[0][1] = 2;
//                array[1][0] = 3;
//                array[1][1] = 4;
//
//                for (int i = 0; i < card.length; i++) {
//                    for (int j = 0; j < card[i].length; j++) {
//                        // System.out.print(card[i][j] + "\t");
//                    }
//                    System.out.println();
//
//                }
//
//            }
//
//
//        }
//    }
//}
//
//
//
//
//
//
//
