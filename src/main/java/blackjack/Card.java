package blackjack;

import java.util.Arrays;
import java.util.Objects;

public class Card {

	private String[] cardNo = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
	private No no;
	private Name name;
	
	public Card (int no, String name) {
		this.no = new No(cardNo[no]);
		this.name = new Name(name);
	}
	
	
	public String getCardName() {
		return name.getName();
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
