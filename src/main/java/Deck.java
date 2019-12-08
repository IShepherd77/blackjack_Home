import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck{

    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<Card>();
        generateDeck();
        shuffle();
    }

    public int getNumOfCards(){
        return cards.size();
    }

    public void generateDeck(){
        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card takeCard(){
        return cards.remove(0);
    }
}