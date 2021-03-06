import java.util.ArrayList;

public class Hand{

    private ArrayList<Card> cards;
    private int value;

    public Hand(){
        this.cards = new ArrayList<Card>();
        this.value = 0;
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }

    public int getHandValue(){
        return this.value;
    }

    public int getNumOfCards(){
        return this.cards.size();
    }

    public void addCard(Card card){
        this.cards.add(card);
        this.value += card.getValue();
    }

    public void removeCard(Card card){
        this.cards.remove(card);
        this.value -= card.getValue();
    }



}







