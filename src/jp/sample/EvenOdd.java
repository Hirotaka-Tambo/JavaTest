package jp.sample;

public class EvenOdd {
	
	public static String CheckEvenOdd(int n) {
		if(n % 2 ==0) {
			return "even";
		}else {
			return "odd";
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(CheckEvenOdd(3));
	}

}
