package com.introductiontooops;

public class Book {
	private int NoOfCopies;

	public int getNoOfCopies() {
		return NoOfCopies;
	}

	public Book(int NoOfCopies) {
		this.NoOfCopies = NoOfCopies;
	}
	public void setNoOfCopies(int NoOfCopies) {
		if (NoOfCopies > 0) {
			this.NoOfCopies = NoOfCopies;
		}
	}

	public void increaseNoOfCopies(int HowMuch) {
		setNoOfCopies(this.NoOfCopies = this.NoOfCopies + HowMuch);

	}
}
