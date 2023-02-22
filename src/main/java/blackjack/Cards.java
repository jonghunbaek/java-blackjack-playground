package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Cards {
	
	private List<Card> cards = new ArrayList<Card>();
	
	public void saveCard(String no, String name) {
		if (name.equals("스페이드")) {
			cards.add(new Spade(no, name));
			return;
		}
		if (name.equals("하트")) {
			cards.add(new Heart(no, name));
			return;
		}
		if (name.equals("다이아몬드")) {
			cards.add(new Diamond(no, name));
			return;
		}
		if (name.equals("클로버")) {
			cards.add(new Clover(no, name));
			return;
		}	
	}

	public Card[] getCards() {
		return cards.stream().toArray(size -> new Card[size]);
	}

}
