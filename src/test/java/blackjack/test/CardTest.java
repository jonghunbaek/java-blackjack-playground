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
	@DisplayName("카드 생성하기 테스트")
	public void createCard() {
		Card result = new Spade(5,"스페이드");
		assertThat(result).isEqualTo(new Spade(5,"스페이드"));
	}	
	
	@Test
	@DisplayName("카드들 가져오기 테스트")
	public void getCard() {
		Cards cards = new Cards();
		cards.saveCard(1, "스페이드");
		cards.saveCard(2, "하트");
		Card[] result = cards.getCards();
		assertThat(result).isEqualTo(new Card[] {new Spade(1,"스페이드"), new Heart(2,"하트")});
	}
}
