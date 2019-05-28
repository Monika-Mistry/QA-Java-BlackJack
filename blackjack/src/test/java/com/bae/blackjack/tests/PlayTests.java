package com.bae.blackjack.tests;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bae.blackjack.mainapp.BlackJack;

public class PlayTests {

	static BlackJack blackjack;

	@BeforeClass
	public static void setup() {
		blackjack = new BlackJack();
	}

	@Test
	public void test1() {
		assertEquals("Invalid Hand", blackjack.play(0, 0));
	}

	@Test
	public void test2() {
		assertEquals("Invalid Hand", blackjack.play(0, 21));
	}

	@Test
	public void test3() {
		assertEquals("Invalid Hand", blackjack.play(21, 0));
	}

	@Test
	public void test4() {
		assertEquals("Dealer Wins!", blackjack.play(10, 10));
	}

	@Test
	public void test5() {
		assertEquals("Dealer Wins!", blackjack.play(30, 21));
	}

	@Test
	public void test6() {
		assertEquals("Invalid Hand", blackjack.play(31, 22));
	}

	@Test
	public void test7() {
		assertEquals("No one Wins", blackjack.play(30, 22));
	}

	@Test
	public void test8() {
		assertEquals("Dealer Wins!", blackjack.play(25, 10));
	}

	@Test
	public void test9() {
		assertEquals("Player Wins!", blackjack.play(10, 25));
	}

	@Test
	public void test10() {
		assertEquals("No one Wins", blackjack.play(25, 25));
	}

	@Test
	public void test11() {
		assertEquals("Dealer Wins!", blackjack.play(10, 21));
	}

	@Test
	public void test12() {
		assertEquals("Player Wins!", blackjack.play(21, 10));
	}

	@Test
	public void test13() {
		assertEquals("Invalid Hand", blackjack.play(31, 31));
	}

	@Test
	public void test14() {
		assertEquals("Invalid Hand", blackjack.play(1, 1));
	}

	@Test
	public void test15() {
		assertEquals("Invalid Hand", blackjack.play(10, 32));
	}

	@Test
	public void test16() {
		assertEquals("Invalid Hand", blackjack.play(10, 1));
	}

	@Test
	public void test17() {
		assertEquals("Invalid Hand", blackjack.play(31, 10));
	}

	@Test
	public void test18() {
		assertEquals("Dealer Wins!", blackjack.play(30, 10));
	}

	@Test
	public void test19() {
		assertEquals("Invalid Hand", blackjack.play(1, 10));
	}

	@Test
	public void test20() {
		assertEquals("Dealer Wins!", blackjack.play(4, 10));
	}

}
