package com.bae.blackjack.mainapp;

public class BlackJack {

	public static void main(String[] args) {
	}

	public String play(int player, int dealer) {

		// while (dealer < 16) {
		// int card = twist();
		// System.out.println(card);
		// if (card == 1)
		// card = ace(dealer);
		// dealer += card;
		// System.out.println(dealer);
		// }

		if (player > 30 || dealer > 30 || player < 3 || dealer < 3)
			return "Invalid Hand";
		else if (player > 21 && player < 31 && dealer > 21 && dealer < 31)
			return "No one Wins";
		else if (player > 21 && player < 31 && dealer <= 21)
			return "Dealer Wins!";
		else if (dealer > 21 && dealer < 31 && player <= 21)
			return "Player Wins!";
		else if (player > dealer && player <= 21)
			return "Player Wins!";
		else if (dealer >= player)
			return "Dealer Wins!";
		else
			return "Invalid Hand";
	}

	public int twist() {
		return (int) (Math.random() * 10) + 1;
	}

	public int ace(int dealer) {
		if (dealer > 10)
			return 1;
		else
			return 11;
	}

}
