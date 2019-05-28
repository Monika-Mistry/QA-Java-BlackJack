package com.bae.blackjack.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bae.blackjack.mainapp.BlackJack;

public class TwistTests {
	static BlackJack blackjack;
	ArrayList<Integer> myList;

	@BeforeClass
	public static void setup() {
		blackjack = new BlackJack();

	}

	@Before
	public void init() {
		myList = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			myList.add(blackjack.twist());
		}
	}

	@Test
	public void testTwist() {

		for (int a : myList) {
			if (a > 0 && a < 11)
				continue;
			else
				fail("Expected value between 1 and 10. Actual: " + a);
		}

		assertTrue(true);

	}

}
