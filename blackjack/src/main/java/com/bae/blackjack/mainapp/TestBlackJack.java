package com.bae.blackjack.mainapp;

public class TestBlackJack extends BlackJack {

	private int outputValue = 0;

	public int getOutputValue() {
		return outputValue;
	}

	public void setOutputValue(int outputValue) {
		this.outputValue = outputValue;
	}

	public int twist() {
		return this.outputValue;
	}

}
