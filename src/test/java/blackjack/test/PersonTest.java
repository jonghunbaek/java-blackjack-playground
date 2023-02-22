package blackjack.test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import blackjack.Card;
import blackjack.Dealer;
import blackjack.Person;
import blackjack.Player;
import blackjack.Spade;

public class PersonTest {

	@Test
	@DisplayName("보유카드 가져오기")
	public void getCards() {
		Person player = new Player(10000);
		Person dealer = new Dealer();
		player.saveCard(1, "스페이드");
		dealer.saveCard(2, "스페이드");
		Card[] result1 = player.getCards();
		Card[] result2 = dealer.getCards();
		assertThat(result1).isEqualTo(new Card[] {new Spade(1, "스페이드")});
		assertThat(result2).isEqualTo(new Card[] {new Spade(2, "스페이드")});
	}
}
