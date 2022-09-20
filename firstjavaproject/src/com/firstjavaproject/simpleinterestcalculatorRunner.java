package com.firstjavaproject;

import java.math.BigDecimal;

public class simpleinterestcalculatorRunner {

	public static void main(String[] args) {
		simpleinterestcalculator calculator = new simpleinterestcalculator("4500.00", "7.5");
		BigDecimal totalvalue = calculator.totalvalue(5);
//		BigDecimal x = new BigDecimal(5);
		System.out.println(totalvalue);
	}

}
