package jp.sample;

public class Hairetu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 入力した数字が 3, 4, 9 のどれかにあたると「アタリ！」が出る
		
		int[] hits = {3,4,9};
		
		//　キーボード入力を受け取る
		
		java.util.Scanner scanner  = new java.util.Scanner(System.in);
		System.out.println("数字を入力してください:");
		
		// 入力された数字を取得
		
		int Inputnumber = scanner.nextInt();
		
		// 入力された数字を取得
		boolean isHit= false;
		
		for(int hit : hits) {
			if (Inputnumber == hit) {
				isHit = true;
				break;	
			}
			
		}
		
		if(isHit) {
			System.out.println("アタリ!!");	
		}else {
			System.out.println("ハズレ、、");	
		}
		
		scanner.close();
		
		// 自分の好きな食べ物を5つ配列に入れてみよう
		
		
		String[] foods = {"寿司","ラーメン","ハンバーグ","おにぎり","焼肉"};
		
		System.out.println(foods[0]);
		System.out.println(foods[1]);
		System.out.println(foods[2]);
		
		
		// 1から10までの数字を配列に入れて、合計を計算してみよう
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			}
		
		 System.out.println(sum);

	}

}
