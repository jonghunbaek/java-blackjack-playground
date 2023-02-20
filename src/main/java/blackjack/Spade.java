package blackjack;


public class Spade implements Card {

	@Override
	public Cards createCard(int no) {
		return new Cards(no, "스페이드");
	}
}
