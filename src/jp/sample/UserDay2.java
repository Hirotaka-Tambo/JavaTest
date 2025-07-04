package jp.sample;

public class UserDay2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Day2 d1 = new Day2(2025, 1, 7);
		Day2 d2 = new Day2(2024, 10, 1);
		
		System.out.println("インスタンスd1の日付は" + d1.formatDay());
		System.out.println("インスタンスd2の日付は" + d2.formatDay());

	}

}
