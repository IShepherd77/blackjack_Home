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
        card1 = new Card(Suit.HEARTS, Rank.TWO);
        card2 = new Card(Suit.CLUBS, Rank.KING);
    }

    @Test
    public void initialHandValueZero(){
        assertEquals(0, hand.getHandValue());
    }
    @Test
    public void hasZeroCards(){
        assertEquals(0, hand.getCards().size());
    }

    @Test
    public void addCardToHand(){
        hand.addCard(card1);
        hand.addCard(card2);
        assertEquals(2, hand.getNumOfCards());
    }

    @Test
    public void totalhandValue(){
        hand.addCard(card1);
        hand.addCard(card2);
        assertEquals(12, hand.getHandValue());
    }
}