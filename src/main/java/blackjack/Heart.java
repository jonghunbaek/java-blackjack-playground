package blackjack;

public class Heart implements Cards {

	@Override
	public Card getCard(String no) {
		return new Card(no, "하트");
	}
}
