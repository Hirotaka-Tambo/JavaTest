package jp.sample;
import java.util.ArrayList;

public class ListHairetsu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("もも"); // Listに追加
		fruits.add("キウイ");
		fruits.add("メロン");
		
		fruits.add(0, "マンゴー");
		
		String first = fruits.get(1); // 番号の要素を取得
		System.out.println(first);
		
		fruits.set(1, "スイカ"); // Listの要素を置き換える
		
		boolean suika = fruits.contains("すいか"); // Listに含まれているかの真偽判定
		
		if(suika == true) {
			fruits.remove("suika"); // Listから削除
			System.out.println(fruits);
		}
		else {
			System.out.println(fruits);
		}
		
		int num = fruits.size(); // 要素数の取得
		
		System.out.println(num);
	
		//System.out.println(suika);
		
		// fruits.clear(); 要素の全削除
		
		
	}

}
