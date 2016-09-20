package pokerBase;

public class Card implements Comparable{
	
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

	@Override
	public int compareTo(Object o1) {
		Card c = (Card)o1;
		return this.iCardNbr - c.iCardNbr;
	}
}
