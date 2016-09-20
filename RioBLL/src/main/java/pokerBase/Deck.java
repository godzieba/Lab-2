package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

public class Deck  {

	private ArrayList<Card> Deck = new ArrayList<Card>();
	
	public Deck () {
		for (int i = 1; i < 5; i++) {
			for (int j = 2; j < 15; j++){
				Card card = new Card(j, i, j);
				Deck.add(card);				
			}
		}
		Collections.shuffle(Deck);
		return;
	}
	
	public ArrayList<Card> getDeck() {
		return Deck;
	}
	
	public Card Draw () {
		Card newcard = (Card) Deck.get(0);
		Deck.remove(0);
		return newcard;
	}
	
	public int DeckSize () {
		return Deck.size();
	}
	

}
