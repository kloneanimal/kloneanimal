package com.firstjavaproject;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isvowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57) {
			return true;
		}
		return false;

	}
	public boolean isAlphabet() {
		if (ch >= 97 && ch <= 122) {
			return true;
		}
		if (ch >= 65 && ch <= 90) {
			return true;
		}
		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isvowel()) {
			return true;
		}
		return false;

	}

	public static void printLowercaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printuppercaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
	}
	}
}
