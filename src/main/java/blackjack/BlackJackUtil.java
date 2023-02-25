package blackjack;

public class BlackJackUtil {

	public int randomCardNo() {
		return (int)(Math.random()*12 + 1);
	}
	
	public int randomCardName() {
		return (int)(Math.random()*4);
	}
}
