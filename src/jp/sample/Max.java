package jp.sample;

public class Max {
	
	public static int FindMax(int a, int b,int c){
		int max = a;
		if(max < b) {
			max = b;
		}
		if(max < c){
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(FindMax(5,7,9));

	}

}
