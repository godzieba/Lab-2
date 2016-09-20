package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Hand {
	
	private ArrayList<Card> Hand;
	private int HandStrength;
	private int HiHand;
	private int LoHand;
	private ArrayList<Card> Kicker = new ArrayList<Card>();
	
	public Hand () {
		Deck deck = new Deck();
		ArrayList <Card> hand = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			hand.add(deck.Draw());
		}
		Collections.sort(hand);
		this.Hand = hand;
	}

	
	public ArrayList<Card> getHand() {
		return Hand;
	}
	
	
	public void EvaluateHand() {		
		Card Card1 = Hand.get(0);
		Card Card2 = Hand.get(1);
		Card Card3 = Hand.get(2);
		Card Card4 = Hand.get(3);
		Card Card5 = Hand.get(4);
		
		
		if (Card1.getiCardSuit() == Card2.getiCardSuit() && Card1.getiCardSuit() == Card3.getiCardSuit() && Card1.getiCardSuit() == Card4.getiCardSuit() && Card1.getiCardSuit() == Card5.getiCardSuit()) {
			if (Card1.getiCardNbr() == 10 && Card2.getiCardNbr() == 11 && Card3.getiCardNbr() == 12 && Card4.getiCardNbr() == 13 && Card5.getiCardNbr() == 14) {
				HandStrength = 10;
				HiHand = 0;
				LoHand = 0;
				return;
			}
			else if (Card1.getiCardNbr() + 1 == Card2.getiCardNbr() && Card2.getiCardNbr() + 1 == Card3.getiCardNbr() && Card3.getiCardNbr() + 1 == Card4.getiCardNbr() && Card4.getiCardNbr() + 1 == Card5.getiCardNbr()) {
				HandStrength = 9;
				HiHand = Card5.getiCardNbr();
				LoHand = 0;
				return;
			}
			else {
				HandStrength = 6;
				HiHand = Card5.getiCardNbr();
				LoHand = Card4.getiCardNbr();
				return;
			}
		}
		else if ((Card1.getiCardNbr() == Card4.getiCardNbr()) || (Card2.getiCardNbr() == Card5.getiCardNbr())) {
			HandStrength = 8;
			HiHand = Card3.getiCardNbr();
			LoHand = 0;
			return;
		}
		else if ((Card1.getiCardNbr() == Card3.getiCardNbr() && Card4.getiCardNbr() == Card5.getiCardNbr()) || (Card1.getiCardNbr() == Card2.getiCardNbr() && Card3.getiCardNbr() == Card5.getiCardNbr())) {
			HandStrength = 7;
			HiHand = Card3.getiCardNbr();
			LoHand = 0;
			return;
		}
		else if (Card1.getiCardNbr() + 1 == Card2.getiCardNbr() && Card2.getiCardNbr() + 1 == Card3.getiCardNbr() && Card3.getiCardNbr() + 1 == Card4.getiCardNbr() && Card4.getiCardNbr() + 1 == Card5.getiCardNbr()) {
			HandStrength = 5;
			HiHand = Card5.getiCardNbr();
			LoHand = 0;
			return;
		}
		else if ((Card1.getiCardNbr() == Card2.getiCardNbr() && Card1.getiCardNbr() == Card3.getiCardNbr()) || (Card2.getiCardNbr() == Card3.getiCardNbr() && Card2.getiCardNbr() == Card4.getiCardNbr()) || (Card3.getiCardNbr() == Card4.getiCardNbr() && Card3.getiCardNbr() == Card5.getiCardNbr())) {
			HandStrength = 4;
			HiHand = Card3.getiCardNbr();
			LoHand = 0;
			return;
		}
		else if ((Card1.getiCardNbr() == Card2.getiCardNbr() && Card3.getiCardNbr() == Card4.getiCardNbr()) || (Card1.getiCardNbr() == Card2.getiCardNbr() && Card4.getiCardNbr() == Card5.getiCardNbr()) || (Card2.getiCardNbr() == Card3.getiCardNbr() && Card4.getiCardNbr() == Card5.getiCardNbr())) {
			HandStrength = 3;
			HiHand = Card4.getiCardNbr();
			LoHand = Card2.getiCardNbr();
			if (Card1.getiCardNbr() == Card2.getiCardNbr() && Card3.getiCardNbr() == Card4.getiCardNbr()) {
				Kicker.add(Card5);
			}
			else if (Card1.getiCardNbr() == Card2.getiCardNbr() && Card4.getiCardNbr() == Card5.getiCardNbr()) {
				Kicker.add(Card3);
			}
			else {
				Kicker.add(Card1);
			}
			return;
		}
		else if (Card1.getiCardNbr() == Card2.getiCardNbr() || Card2.getiCardNbr() == Card3.getiCardNbr() || Card3.getiCardNbr() == Card4.getiCardNbr() || Card4.getiCardNbr() == Card5.getiCardNbr()) {
			HandStrength = 2;
			if (Card1.getiCardNbr() == Card2.getiCardNbr()) {
				HiHand = Card2.getiCardNbr();
				LoHand = Card5.getiCardNbr();
				Kicker.add(Card3);
				Kicker.add(Card4);
			}
			else if (Card2.getiCardNbr() == Card3.getiCardNbr()) {
				HiHand = Card3.getiCardNbr();
				LoHand = Card5.getiCardNbr();
				Kicker.add(Card1);
				Kicker.add(Card4);
			}
			else if (Card3.getiCardNbr() == Card4.getiCardNbr()) {
				HiHand = Card4.getiCardNbr();
				LoHand = Card5.getiCardNbr();
				Kicker.add(Card1);
				Kicker.add(Card2);
			}
			else {
				HiHand = Card5.getiCardNbr();
				LoHand = Card3.getiCardNbr();
				Kicker.add(Card1);
				Kicker.add(Card2);
			}
			return;
		}
		else {
			HandStrength = 1;
			HiHand = Card5.getiCardNbr();
			LoHand = Card4.getiCardNbr();
			Kicker.add(Card1);
			Kicker.add(Card2);
			Kicker.add(Card3);
			return;
		}
		
	}
	




}
