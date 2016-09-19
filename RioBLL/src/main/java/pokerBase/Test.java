package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Card card = deck.Draw();
		System.out.println(deck.DeckSize());
		Deck newdeck = new Deck();
		Card newcard = newdeck.Draw();
		System.out.println(deck.DeckSize());

		
		
		
		
		

	}

}
