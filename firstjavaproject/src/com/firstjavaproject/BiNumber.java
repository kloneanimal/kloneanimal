package com.firstjavaproject;

public class BiNumber {
	private int number1;
	private int number2;

	public BiNumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int add() {
		return number1 + number2;
	}

	public int multiply() {
		return number1 * number2;
	}

	public void doublevalue() {
		this.number1 = number1 * number1;
		this.number2 = number2 * number2;

	}

	public int getnumber1() {
		// TODO Auto-generated method stub
		return number1;
	}

	public int getnumber2() {
		// TODO Auto-generated method stub
		return number2;
	}

}
