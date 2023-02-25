package blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cards {
	
	private List<Card> cards = new ArrayList<Card>();
	
	public void saveCard(int no, int name) {
		cards.add(new Card(no-1, name));
	}

	public Card[] getCards() {
		return cards.stream().toArray(size -> new Card[size]);
	}
	
	public int sumCards() {
		return Card.sumTotal(Card.sumNumber(cards), Card.sumNotNumber(cards), cards);
	}
	
	public boolean isDistinctCard(Card card) {
		if (cards.contains(card)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cards);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cards other = (Cards) obj;
		return Objects.equals(cards, other.cards);
	}
}
