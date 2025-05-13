package jp.sample;

public class BasicCalculation {

	    public double add(double a, double b) {
	        return a + b;
	    }

	    public double subtract(double a, double b) {
	        return a - b;
	    }

	    public double multiply(double a, double b) {
	        return a * b;
	    }

	    public double divide(double a, double b) {
	        if (b == 0) {
	            throw new IllegalArgumentException("0 で割ることはできません");
	        }
	        return a / b;
	    }
}
