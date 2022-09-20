package com.introductiontooops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(200);
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		Book effectiveJava = new Book(100);
		System.out.println(effectiveJava.getNoOfCopies());
		Book cleanCode = new Book(350);
		System.out.println(cleanCode.getNoOfCopies());
		// artOfComputerProgramming.setNoOfCopies(200);
		// effectiveJava.setNoOfCopies(300);
		// cleanCode.setNoOfCopies(250);
		artOfComputerProgramming.increaseNoOfCopies(100);
		System.out.println(artOfComputerProgramming.getNoOfCopies());
	}

}
