package blackjack;

public class Spade extends Cards {

	@Override
	public Card getCard(String no) {
		return new Card(no, "스페이드");
	}
}
