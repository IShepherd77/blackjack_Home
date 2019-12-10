import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest{


    Hand hand;
    Card card1;
    Card card2;

    @Before
    public  void setUp(){
        hand = new Hand();
        card1 = new Card(Suit.HEARTS, Rank.TWO);
        card2 = new Card(Suit.CLUBS, Rank.KING);
    }


    @Test
    public void startWithNoCards(){
        assertEquals(0, hand.getNumOfCards());
    }

    @Test
    public void canTakeCards(){
        hand.addCard(card1);
        hand.addCard((card2));
        assertEquals(2, hand.getCards().size());
    }

    @Test
    public void totalValueStartsZero(){
        assertEquals(0, hand.getHandValue());
    }

    @Test
    public void totalCardsValue(){
        hand.addCard(card2);
        hand.addCard(card1);
        assertEquals(12, hand.getHandValue());
    }

    @Test
    public void canRemoveCard(){
        hand.addCard(card1);
        hand.addCard(card2);
        hand.removeCard(card1);
        assertEquals(1, hand.getCards().size());
    }

    @Test
    public void getCardValueAfterRemovingCard(){
        hand.addCard(card1);
        hand.addCard(card2);
        hand.removeCard(card1);
        assertEquals(10, hand.getHandValue());
    }
}