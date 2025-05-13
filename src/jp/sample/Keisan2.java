package jp.sample;

public class Keisan2 {

		public static void main(String[] args) {
			/*
			 * System.out --- 出力装置(標準出力)
			 * println --- 出力命令(print + 改行)
			 * 例の一覧
			 * 画面に表示：System.out.println("Hello");
			 * 改行なし出力：System.out.print("Hello");
			 * 大きい値を取得：Math.max(3, 7)
			 * 文字列を数値へ：Integer.parseInt("23")
			 * 乱数生成：new Random().nextInt(10)
			 * キーボード入力：new Scanner(System.in).nextLine()
			 */
			
			/*
			 * 「==」は、数値の正誤を確認するもの。
			 * 反対に、「equals」は文字列の正誤を確認するもの。
			 */
			String a = new String("パー");
			String b = new String("パー");
			
			if (a == b) {
				System.out.println("==で同じ");
			}else {
				System.out.println("==で違う");
			}

			if (a.equals(b)) {
				System.out.println("equalsで同じ");
			}else {
				System.out.println("equalsで違う");
				}
			
			// 3 + 5 * 2 を計算し、その結果を画面に表示するプログラムを書いてください。
			
			int c = 3 + 5 * 2;
			
			System.out.println(c);
			
			// int d = 10; のあと、変数aを1増やし、結果を出力するプログラムを書いてください。
			int d = 10;
			d ++;
			System.out.println(d);
			
			// 文字列 "Hello" に整数 5 を連結し、表示するプログラムを書いてください。
			String text = "Hello";
			int number = 5;
			String result = text + number;
			System.out.println(result);
			
			// "Java学習" という文字列が1行で表示されるように print() と println() を使い分けて書いてください。
			System.out.print("Java");
			System.out.println("学習中");
			
			// 7.9 を int にキャストし、その結果を出力するプログラムを書いてください
			
			int e = (int) 7.9;
			
			// 応用
			// int result = 8 / 3; と double result = 8 / 3.0; の出力結果を比較して表示するプログラムを書いてください。
			
			int result1 = 8 / 3;
			double result2 = 8 / 3.0;
			
			System.out.println("result1:"+result1);
			System.out.println("result2:"+result2);
			
			if(result1 == result2) {
				System.out.println("result1とresult2は同じ値");
			}else {
				System.out.println("result1とresult2は異なる値");			
			}
			
			// 変数x=3, y=5として Math.max(x + 2, y - 1) の結果を出力するプログラムを書いてください。
			
			int x = 3;
			int y = 5;
			
			System.out.println(Math.max(x + 2, y -1));
			
			// エスケープシーケンスを使って、"Java"の勉強 と表示するプログラムを書いてください。
			
			System.out.println("\"Java\"の勉強");
			
			Math.max(x + 2 ,y -1);
			
			}
}
