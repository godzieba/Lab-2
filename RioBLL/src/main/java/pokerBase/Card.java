package pokerBase;

import java.util.Comparator;

public class Card {
	
	private int iCardNbr;
	private int iCardSuit;
	private int iCardRank;
	
	public Card (int CardNbr, int CardSuit, int CardRank) {
		iCardNbr = CardNbr;
		iCardSuit = CardSuit;
		iCardRank = CardRank;
	}
	
	public int getiCardNbr() {
		return iCardNbr;
	}
	
	public int getiCardSuit() {
		return iCardSuit;
	}
	
	public int getiCardRank() {
		return iCardRank;
	}
}
