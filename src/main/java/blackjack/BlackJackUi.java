package blackjack;

import java.util.Scanner;

public class BlackJackUi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("게임에 참여할 사람의 이름을 입력하세요.");
		String playerNames = sc.next();
		
		// 반복문으로 
		System.out.println("의 배팅 금액은?");
		int bettingMoney = sc.nextInt();
		
		System.out.println("딜러와 00, 00에게 2장의 카드를 나누었습니다.");

		System.out.println("딜러: ");
		// 반복문으로
		System.out.println("00카드: ");
		
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
