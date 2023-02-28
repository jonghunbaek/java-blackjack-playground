package blackjack;

import java.util.List;

public class BlackJack {

	private Players players = new Players();
	private BlackJackUtil util = new BlackJackUtil();
	private Cards cards = new Cards();
	
	public String[] playerCheck(String playerNames) {
		return playerNames.split(",");
	}

	public void joinPlayer(Person player) {
		players.savePlayer(player);
	}

	public void handOutCards(int num) {
		for (int i=0; i<2; i++) {
			int[] card = new int[2];
			card = createCards();
			players.getPlayers().get(num).saveCard(card[0], card[1]);
		}
		for (int i=0; i<2; i++) {
			System.out.println(players.getPlayers().get(num).getCards()[i].getCardNo() 
							  +players.getPlayers().get(num).getCards()[i].getCardName()); 
		}
	}
	
	public int[] createCards() {
		return new int[] {util.randomCardNo(), util.randomCardName()};
	}

	public List<Person> getPlayer() {
		return players.getPlayers();
	}
}
