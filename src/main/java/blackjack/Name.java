package blackjack;

import java.util.Objects;

public class Name {

	private String name;
	
	public Name(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(name, other.name);
	}
}
