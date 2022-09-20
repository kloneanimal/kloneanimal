package com.firstjavaproject;

import java.math.BigDecimal;

public class simpleinterestcalculator {

	BigDecimal interest;
	BigDecimal principal;
	BigDecimal noofyears;

	public simpleinterestcalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal totalvalue(int noofyears) {

//		return this.principal.add(this.principal.multiply(this.interest).multiply(new BigDecimal(noofyears)));
		BigDecimal totalvalue = principal.add((principal).multiply(interest).multiply(new BigDecimal(noofyears)));
//		this.totalvalue=new BigDecimal(totalvalue);
		return totalvalue;
	}


}
