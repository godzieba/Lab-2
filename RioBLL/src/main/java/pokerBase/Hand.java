package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Hand {
	
	private ArrayList<Card> Hand;
	private UUID HandID;
	
	public Hand () {
		ArrayList <Card> hand = new ArrayList<>();
		Deck deck = new Deck();
		for (int i = 0; i < 5; i++) {
			hand.add(deck.Draw());
		}
		Collections.sort(hand);
		this.Hand = hand;
	}
	
	public UUID getHandID() {
		return HandID;
	}
	
	public ArrayList<Card> getHand() {
		return Hand;
	}




}
