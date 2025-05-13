package jp.sample;


public class Keisan {

		public static void main(String[] args) {
			int a = 5;
			int b = 2;
			int result = a / b;
			System.out.println(result);// TODO 自動生成されたメソッド・スタブ
			// resultの値は2。小数点以下は切り捨てのため。
			
			/* 
			 * 演算子ーーー「+」「-」などの記号のこと
			 * オペランドーーー数字の値のこと。
			 */

			int x = 10;
			x += 5;
			System.out.println(x);
			// xの値は15に変化。

			int c = 7;
			int d = 3;
			int kekka = c % d;
			System.out.println(kekka);

			double e = 5.8;
			int number = (int) e;
			System.out.println(e);
		}

}


