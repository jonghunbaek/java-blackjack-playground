package blackjack;

import java.util.Objects;

public class No {

	private String no;
	
	public No(String no) {
		this.no = no;
	}
	
	public String getNo() {
		return this.no;
	}

	@Override
	public int hashCode() {
		return Objects.hash(no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		No other = (No) obj;
		return Objects.equals(no, other.no);
	}
}
