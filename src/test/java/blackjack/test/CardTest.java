package blackjack.test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import blackjack.Cards;
import blackjack.Heart;
import blackjack.Card;
import blackjack.Spade;

public class CardTest {

	@Test
	@DisplayName("카드 가져오기 테스트")
	public void getCard() {
		Spade spade = new Spade();
		Card result = spade.getCard("5");
		assertThat(result).isEqualTo(new Card("5","스페이드"));
	}	
}
