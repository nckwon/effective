package com.effective.ch46;

import java.util.*;

/**
 * Created by nckwon on 2017. 3. 25..
 */
public class Demo {

    public Demo() {}
    enum Suit { CLUB, DIAMOND, HEART, SPADE }
    enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
    TEN, JACK, QUEEN, KING}

    public void makeCard() {

        Collection<Suit> suits = Arrays.asList(Suit.values());
        Collection<Rank> ranks = Arrays.asList(Rank.values());

        // case 1 :  버그 존재
        List<Card> deck = new ArrayList<Card>();
        for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ) {
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); ) {
                deck.add(new Card(i.next(), j.next()));
            }
        }

        // case 2 :  고치긴 했는데 코드가 보기 싫다.
        for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ) {
            Suit suit = i.next();
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); ) {
                deck.add(new Card(suit, j.next()));
            }
        }

        for (Suit suit : suits)
            for (Rank rank : ranks)
                deck.add(new Card(suit, rank));
    }

    class Card {
        public Card(Suit suit, Rank rank) {

        }
    }
}
