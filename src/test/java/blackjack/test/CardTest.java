package blackjack.test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import blackjack.Cards;
import blackjack.Card;

public class CardTest {

	@Test
	@DisplayName("카드 생성하기 테스트")
	public void createCard() {
		Card result = new Card(5,0);
		assertThat(result).isEqualTo(new Card(5, 0));
	}	
	
	@Test
	@DisplayName("카드들 가져오기 테스트")
	public void getCard() {
		Cards cards = new Cards();
		cards.saveCard(1, 0);
		cards.saveCard(2, 3);
		Card[] result = cards.getCards();
		assertThat(result).isEqualTo(new Card[] {new Card(0,0), new Card(1,3)});
	}
	
	@Test
	@DisplayName("카드값 합계 테스트")
	public void sumCards() {
		Cards cards = new Cards();
		cards.saveCard(3, 0);
		cards.saveCard(8, 3);
		cards.saveCard(1, 1);
		int result = cards.sumCards();
		assertThat(result).isEqualTo(12);
	}
	
	@Test
	@DisplayName("카드 이름, 값 중복 테스트")
	public void isDistinctCard() {
		Cards cards = new Cards();
		Card card = new Card(2, 0);
		cards.saveCard(3, 0);
		cards.saveCard(8, 3);
		cards.saveCard(1, 1);
		assertThat(cards.isDistinctCard(card)).isFalse();
	}
}
