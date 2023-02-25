package blackjack;

public interface Person {

	abstract void saveCard(int no, int name);
	abstract Card[] getCards();
}
