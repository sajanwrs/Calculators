/**
 * 
 */
package com.javaoo.calculators;

/**
 * @author waris
 *
 */

public class ScientificCalculator {
	/*
	 * A global attribute for PI value
	 */
	static final double PI = 3.14159;

	/*
	 * A double attribute to hold a value in memory
	 */
	private double holdValue;

	/*
	 * Method to perform exponents functionality
	 */
	public double exp(double x) {
		return Math.exp(x);
	}

	/*
	 * Method to perform logarithmic functionality
	 */
	public double log(double x) {
		return Math.log(x);
	}

	/*
	 * Method to put value in memory
	 */
	public void putValueInMemory(double x) {

	}

	/*
	 * Method to get value in memory
	 */
	public double getValueInMemory() {
		return 0;
	}
}
