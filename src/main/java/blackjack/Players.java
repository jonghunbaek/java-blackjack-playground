package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Players {
	
	List<Person> players = new ArrayList<Person>();
	
	public void savePlayer(Person player) {
		players.add(player);
	}
	
	public List<Person> getPlayers() {
		return players;
	}
	
	public void saveCards(int no, int name) {
		for (Person player : players) {
			player.saveCard(no, name);
		}
	}
}
