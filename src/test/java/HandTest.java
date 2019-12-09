import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest{

    Hand hand;
    Card card1;
    Card card2;

    @Before
    public void setUp(){
        hand = new Hand();
        card1 = new Card(Suit.CLUBS, Rank.KING);
        card2 = new Card(Suit.SPADES, Rank.TWO);
    }

    @Test
    public void startWithZeroCards(){
        assertEquals(0, hand.getCards().size());
    }

    @Test
    public void startWithZeroValue(){
        assertEquals(0, hand.getHandValue());
    }

    @Test
    public void addCard(){
        hand.addCard(card1);
        hand.addCard(card2);
        assertEquals(2, hand.getNumOfCards());
    }

    @Test
    public void removeCard(){
        hand.addCard(card1);
        hand.addCard(card2);
        hand.removeCard(card1);
        assertEquals(1, hand.getNumOfCards());
        assertEquals(2, hand.getHandValue());
    }

    @Test
    public void getHandValue(){
        hand.addCard(card2);
        hand.addCard(card1);
        assertEquals(12, hand.getHandValue());
    }
}



