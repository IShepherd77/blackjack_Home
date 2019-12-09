import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;

public class DeckTest{

    private Deck deck;

    @Before
    public void setUp(){
        deck = new Deck();
    }

    @Test
    public void deckHas52Cards(){
        assertEquals(52, deck.getNumOfCards());
    }

    @Test
    public void canShuffleDeck(){
        Deck deck2 = new Deck();
        assertFalse(deck.equals(deck2));
    }

    @Test
    public void canTakeCard(){
        Card card = deck.takeCard();
        Assert.assertNotNull(card);
    }
}