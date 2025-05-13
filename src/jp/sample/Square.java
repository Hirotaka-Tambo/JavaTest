package jp.sample;

public class Square {
	
	public static double squre1(double line) {
		return line * line;
	}
	
	public static double squre2(double vertical, double width) {
		return vertical * width; 
	}
	
	public static double triangle(double border, double height) {
		return border * height / 2;
	}
	
	public static void main(String[] args) {
		System.out.println(squre1(5.0));
		System.out.println(squre2(3.0,6.0));
		System.out.println(triangle(6.0,9.0));
	}

}
