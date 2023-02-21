package blackjack;

public class Diamond extends Cards {

	@Override
	public Card getCard(String no) {
		return new Card(no, "다이아몬드");
	}
}
