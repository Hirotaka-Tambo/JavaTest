package jp.sample;

public class Circle {
	public static double CalcCircle(double r) {
		return r * r * 3.14;
	}
	
	public static void main(String[] args){
		double result = CalcCircle(4.0);
		System.out.println(result);
	}

}
