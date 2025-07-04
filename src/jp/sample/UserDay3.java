package jp.sample;

public class UserDay3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Day3 d1 = new Day3 (2025, 1, 7); //年、月、日を指定
		Day3 d2 = new Day3(2024, 10); //年、月だけを指定
		
		System.out.println("インスタンス d1 の日付は" + d1.formatDay());
		System.out.println("インスタンス d2 の日付は" + d2.formatDay());
		

	}

}
