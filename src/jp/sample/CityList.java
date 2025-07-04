package jp.sample;

import java.util.ArrayList;

public class CityList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("東京");
		list.add("大阪");
		list.add("名古屋");
		list.add("福岡");
		
		list.remove(1);
		
		for (String city:list) {
			System.out.println(city);
		}
		

	}

}
