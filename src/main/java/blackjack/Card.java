package blackjack;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Card {

	private static final String[] cardNo = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
	private static final String[] cardName = {"스페이드", "클로버", "다이아몬드", "하트"};
	private No no;
	private Name name;
	
	public Card (int no, int name) {
		this.no = new No(cardNo[no]);
		this.name = new Name(cardName[name]);
	}
	
	public String getCardNo() {
		return no.getNo();
	}
	
	public String getCardName() {
		return name.getName();
	}
	
	public boolean isNumber(String no) {
		try {
			Integer.parseInt(no);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	public boolean isAce(String no) {
		if (no.equals("A")) {
			return true;
		}
		return false;
	}
	
	public static int sumNumber(List<Card> cards) {
		return cards.stream()
				  .filter(card -> card.isNumber(card.getCardNo()))
				  .map(card -> Integer.parseInt(card.getCardNo()))
				  .reduce(0, (a, b) -> (a + b));
	}
	
	public static int sumNotNumber(List<Card> cards) {
		return cards.stream()
				.filter(card -> !card.isNumber(card.getCardNo()))
				.filter(card -> !card.isAce(card.getCardNo()))
				.map(card -> 10)
				.reduce(0, (a,b) -> (a+b));
	}
	
	public static int sumTotal(int sumNumber, int sumNotNumber, List<Card> cards) {
		int total = sumNumber + sumNotNumber;
		boolean haveAce = cards.stream()
							   .anyMatch(card -> card.getCardNo().equals("A"));
		if (total+11 <= 21 && haveAce) {
			return total + 11;
		}
		if (total+11 > 21 && haveAce) {
			return total + 1;
		}
		return total;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cardNo);
		result = prime * result + Objects.hash(name, no);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Arrays.equals(cardNo, other.cardNo) && Objects.equals(name, other.name) && Objects.equals(no, other.no);
	}
}
