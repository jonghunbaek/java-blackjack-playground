package blackjack;

import java.util.Scanner;

public class BlackJackUi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BlackJack blackJack = new BlackJack();
		
		System.out.println("게임에 참여할 사람의 이름을 입력하세요.");
		String playerNames = sc.next();
		String[] playerName = blackJack.playerCheck(playerNames);
		
		blackJack.joinPlayer(new Dealer("딜러"));
		for (int i=0; i<playerName.length; i++) {
			System.out.println(playerName[i] + "의 배팅 금액은?");
			int bettingMoney = sc.nextInt();
			blackJack.joinPlayer(new Player(playerName[i], bettingMoney));
		}
		for (int i=0; i<blackJack.getPlayer().size(); i++) {
			blackJack.handOutCards(i);			
		}
		
		System.out.print("딜러와");
		for (int i=0; i<playerName.length; i++) {
			if (i == playerName.length-1) {
				System.out.print(playerName[i]);
				break;
			}
			System.out.print(playerName[i] + ", ");
		}
		System.out.println("에게 2장의 카드를 나누었습니다.");

		for (int i=0; i<blackJack.getPlayer().size(); i++) {
			System.out.print(blackJack.getPlayer().get(i).getName() + ":");
			for (int j=0; j<blackJack.getCards().length; j++) {
				System.out.print(blackJack.getCards()[j] + (j == blackJack.getCards().length-1 ? "\n" : ", "));
			}
		}	
		// 분기 후
		System.out.println("00은 한장의 카드를 더 받겠습니까?");
		String answer = sc.next();
		
		// 딜러 카드 값 분기 후
		System.out.println("딜러는 16이하라 한장의 카드를 더 받았습니다.");
	
		System.out.println("딜러 카드: " + "결과: ");
		// 반복문으로
		System.out.println("00 카드: " + "결과: ");
		
	    System.out.println("## 최종 수익");
	    System.out.println("딜러: ");
	    // 반복문으로
	    System.out.println("00: ");
	}
}
