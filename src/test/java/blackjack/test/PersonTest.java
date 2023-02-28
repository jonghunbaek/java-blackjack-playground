package blackjack.test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import blackjack.Card;
import blackjack.Dealer;
import blackjack.Person;
import blackjack.Player;

public class PersonTest {

	@Test
	@DisplayName("보유카드 가져오기")
	public void getCards() {
		Person player = new Player("김덕배",10000);
		Person dealer = new Dealer("딜러");
		player.saveCard(1, 0);
		dealer.saveCard(2, 0);
		Card[] result1 = player.getCards();
		Card[] result2 = dealer.getCards();
		assertThat(result1).isEqualTo(new Card[] {new Card(1, 0)});
		assertThat(result2).isEqualTo(new Card[] {new Card(2, 0)});
	}
}
