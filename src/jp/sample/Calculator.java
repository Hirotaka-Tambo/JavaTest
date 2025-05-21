package jp.sample;

public class Calculator {

	/*
	*1.add: 2つの整数を受け取り、その和を返す
	*2.subtract: 2つの整数を受け取り、その差を返す
	*3.multiply: 2つの整数を受け取り、その積を返す
	*4.divide: 2つの整数を受け取り、その商を返す（ゼロ除算の処理も考慮）
	*5.max: 2つの整数を受け取り、大きい方の値を返す
	*/
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int c, int d) {
		if(c < d) {
			return 0;
		}
		return c - d;
	}
	
	public static int multiply(int e, int f) {
		return e * f;
	}
	
	public static int divide(int n, int m) {
		if(n < m) {
			return 0;
		}
		return n / m;
	}
	
	public static int max(int x, int y) {
		if( x > y) {
			return x;
		}
		else {
			return y;
		}
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("和"+ add(5, 9));
		
		System.out.println("差"+ subtract(14 ,2));
		
		System.out.println("積"+ multiply(5,9));
		
		System.out.println("商"+ divide(16,4));
		
		System.out.println("比較" + max(13,99));
		

	}

}
