package blackjack;

public class Clover extends Cards{

	@Override
	public Card getCard(String no) {
		return new Card(no, "클로버");
	}
}
