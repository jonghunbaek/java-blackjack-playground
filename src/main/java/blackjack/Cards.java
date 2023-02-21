package blackjack;

import java.util.Arrays;
import java.util.List;

public interface Cards {

	List<Integer> nubmers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	abstract Card getCard(String no);
	
}
