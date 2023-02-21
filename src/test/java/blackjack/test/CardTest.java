package blackjack.test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import blackjack.Cards;
import blackjack.Heart;
import blackjack.BlackJack;
import blackjack.Card;
import blackjack.Spade;

public class CardTest {

	@Test
	@DisplayName("카드 가져오기 테스트")
	public void getCard() {
		Cards spade = new Spade();
		Card result = spade.getCard("5");
		assertThat(result).isEqualTo(new Card("5","스페이드"));
	}	
	
	@Test
	@DisplayName("카드 생성하기 테스트")
	public void createCard() {
		Cards cards = new Cards();
		Card result = cards.createCard(5,"스페이드");
		assertThat(result).isEqualTo(new Card("5","스페이드"));
	}
}
