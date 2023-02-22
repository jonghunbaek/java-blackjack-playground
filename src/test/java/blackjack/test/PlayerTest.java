package blackjack.test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import blackjack.Player;

public class PlayerTest {

	@Test
	@DisplayName("배팅금액 확인 테스트")
	public void getBettingMoney() {
		Player player = new Player(10000);
		int result = player.getBettingMoney();
		assertThat(result).isEqualTo(new Player(10000).getBettingMoney());
	}
}
