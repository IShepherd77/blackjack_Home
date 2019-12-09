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
        card1 = new Card(Suit.DIAMONDS, Rank.FIVE);
        card2 = new Card(Suit.DIAMONDS, Rank.FOUR);
    }

    @Test
    public void handIsInitiallyZero(){
        assertEquals(0, hand.getHandValue());
    }

    @Test
    public void cardIsAdded(){
        hand.addCard(card1);
        hand.addCard(card2);
        assertEquals(2, hand.getCards().size());
    }

    @Test
    public void handHasValue(){
        hand.addCard(card2);
        hand.addCard(card1);
        assertEquals(9, hand.getHandValue());
    }
}