package jp.sample;

public class Repeat {
	
	public static String repeat(String text, int count) {
		StringBuilder result = new StringBuilder(); 
		for(int i = 0; i < count ; i++) {
			result.append(text);
		}
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(repeat("abc",3));

	}

}
