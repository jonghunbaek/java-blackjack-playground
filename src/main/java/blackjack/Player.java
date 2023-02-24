package blackjack;

import java.util.Objects;

public class Player implements Person {
	
	private int betting;
	private Name name;
	private Cards cards = new Cards();

	public Player(String name, int betting) {
		this.name = new Name(name);
		this.betting = betting;
	}
	
	public String getPlayerName() {
		return name.getName();
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
