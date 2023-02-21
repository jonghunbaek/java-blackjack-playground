package blackjack;

import java.util.Objects;

public class Card {

	private No no;
	private Name name;
	
	public Card (String no, String name) {
		this.no = new No(no);
		this.name = new Name(name);
	}
	
	public String getCardNo() {
		return no.getNo();
	}
	public String getCardName() {
		return name.getName();
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, no);
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
		return Objects.equals(name, other.name) && Objects.equals(no, other.no);
	}
	
}
