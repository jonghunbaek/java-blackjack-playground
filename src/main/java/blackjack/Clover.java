package blackjack;

public class Clover implements Cards{

	@Override
	public Card getCard(String no) {
		return new Card(no, "클로버");
	}
}
