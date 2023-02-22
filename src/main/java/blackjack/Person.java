package blackjack;

public interface Person {

	abstract void saveCard(int no, String name);
	abstract Card[] getCards();
}
