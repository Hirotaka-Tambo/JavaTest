package jp.sample;

public class Day2 {
	//フィールド
	int year;
	int month;
	int date;
	
	//メソッド
	String formatDay() {
		return year + "年" + month + "月" + date + "日";
	}
	
	//コンストラクタ
	Day2(int y ,int m ,int d) {
		// TODO 自動生成されたコンストラクター・スタブ
		year = y;
		month = m;
		date = d;
	}
	
	

}
