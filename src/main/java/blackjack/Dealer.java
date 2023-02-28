package blackjack;

import java.util.Objects;

public class Dealer implements Person {

	private Cards cards = new Cards();
	private Name name;
	
	public Dealer(String name) {
		this.name = new Name(name);
	}
	
	@Override
	public String getName() {
		return name.getName();
	}
	
	@Override
	public void saveCard(int no, int name) {
		cards.saveCard(no, name);
	}
	
	@Override
	public Card[] getCards() {
		return cards.getCards();
	}
}
