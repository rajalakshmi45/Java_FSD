package comm.example;

public class Card {
	private Suit suit;
	private Rank rank;
	public Card(Suit s, Rank r) {
		super();
		this.suit = s;
		this.rank = r;
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Card [suit=" + suit + ", rank=" + rank + "]";
	}
	
	
}
