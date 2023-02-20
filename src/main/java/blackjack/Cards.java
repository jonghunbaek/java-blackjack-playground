package blackjack;

import java.util.Objects;

public class Cards {

	private int cardNo;
	private String cardName;
	
	public Cards (int cardNo, String cardName) {
		this.cardNo = cardNo;
		this.cardName = cardName;
	}
	
	public int getCardNo() {
		return cardNo;
	}
	public String getCardName() {
		return cardName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cardName, cardNo);
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
		return Objects.equals(cardName, other.cardName) && cardNo == other.cardNo;
	}
	
	
}
