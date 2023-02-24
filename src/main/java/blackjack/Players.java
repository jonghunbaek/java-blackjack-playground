package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Players {
	
	List<Player> players = new ArrayList<Player>();
	
	public void savePlayer(Player player) {
		players.add(player);
	}
	
	public Player[] getPlayers() {
		return players.stream().toArray(s -> new Player[s]);
	}
}
