package blackjack;

public class BlackJack {

	private Players players = new Players();
	
	public String[] playerCheck(String playerNames) {
		return playerNames.split(",");
	}

	public void joinPlayer(String playerName, int bettingMoney) {
		players.savePlayer(new Player(playerName, bettingMoney));
	}

	public void handOutCards() {
		
	}
	
}
