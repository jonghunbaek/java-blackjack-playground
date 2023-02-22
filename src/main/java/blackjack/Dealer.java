package blackjack;

import java.util.Objects;

public class Dealer implements Person {

	private Cards cards = new Cards();
	
	@Override
	public void saveCard(int no, String name) {
		cards.saveCard(no, name);
	}
	@Override
	public Card[] getCards() {
		return cards.getCards();
	}
}
