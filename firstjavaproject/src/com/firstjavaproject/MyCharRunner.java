package com.firstjavaproject;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar mychar = new MyChar('V');
		System.out.println(mychar.isvowel());
		System.out.println(mychar.isDigit());
		System.out.println(mychar.isAlphabet());
		mychar.isConsonant();
		System.out.println(mychar.isConsonant());
		mychar.printLowercaseAlphabets();
		mychar.printuppercaseAlphabets();

	}

}
