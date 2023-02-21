package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Cards {
	
	private List<Card> cards = new ArrayList<Card>();
	Cards spade = new Spade();
	Cards clover = new Clover();
	Cards heart = new Heart();
	Cards diamond = new Diamond();
	
	public Card getCard(String no) {
		return new Card(no, " ");
	}

	final public Card createCard(int no, String name) {
		Card card;
		if (name.equals("스페이드")) {
			card = spade.getCard(String.valueOf(no));
			cards.add(card);
			return card;
		}
		if (name.equals("클로버")) {
			card = clover.getCard(String.valueOf(no));
			cards.add(card);
			return card;
		}
		if (name.equals("하트")) {
			card = heart.getCard(String.valueOf(no));
			cards.add(card);
			return card;
		}
		
		card = diamond.getCard(String.valueOf(no));
		cards.add(card);
		return card;
	}
}
