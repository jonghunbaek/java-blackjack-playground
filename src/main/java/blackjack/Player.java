package blackjack;

import java.util.Objects;

public class Player implements Person {
	
	private int betting;
	private Cards cards = new Cards();

	public Player(int betting) {
		this.betting = betting;
	}

	public int getBettingMoney() {
		return this.betting;
	}
	
	@Override
	public void saveCard(int no, String name) {
		cards.saveCard(no, name);
	}
	@Override
	public Card[] getCards() {
		return cards.getCards();
	}
}
