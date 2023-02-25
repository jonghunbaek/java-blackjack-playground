package blackjack;

public class BlackJack {

	private Players players = new Players();
	private Dealer dealer = new Dealer();
	private BlackJackUtil util = new BlackJackUtil();
	
	public String[] playerCheck(String playerNames) {
		return playerNames.split(",");
	}

	public void joinPlayer(String playerName, int bettingMoney) {
		players.savePlayer(new Player(playerName, bettingMoney));
	}

	public void handOutCards(int num) {
		int[] card1 = new int[2];
		int[] card2 = new int[2];
		card1 = createCards();
		card2 = createCards();

		if (num == players.getPlayers().size()+1) {
			dealer.saveCard(card1[0], card1[1]);
			dealer.saveCard(card2[0], card2[1]);
			return;
		}
		players.getPlayers().get(num).saveCard(card1[0], card1[1]);
		players.getPlayers().get(num).saveCard(card2[0], card2[1]);
	}
	
	public int[] createCards() {
		return new int[] {util.randomCardNo(), util.randomCardName()};
	}
	
}
