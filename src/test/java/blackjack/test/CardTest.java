package blackjack.test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import blackjack.Cards;
import blackjack.Spade;

public class CardTest {

	@Test
	@DisplayName("카드 생성 테스트")
	public void createCard() {
		Spade spade = new Spade();
		Cards result = spade.createCard(5);
		assertThat(result).isEqualTo(new Cards(5,"스페이드"));
	}
}
