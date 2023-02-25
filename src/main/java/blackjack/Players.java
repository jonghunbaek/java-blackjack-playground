package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Players {
	
	List<Player> players = new ArrayList<Player>();
	
	public void savePlayer(Player player) {
		players.add(player);
	}
	
	public List<Player> getPlayers() {
		return players;
	}
	
	public void saveCards(int no, int name) {
		for (Player player : players) {
			player.saveCard(no, name);
		}
	}
}
