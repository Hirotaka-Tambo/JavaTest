package jp.sample;
public class IfWhileFor {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// もし体重が30kgより大きいなら「大きいね！」と表示するプログラムを書こう

		int a = 25;
		
		if(a > 30) {
			System.out.println("大きいね");
		}else {
			System.out.println("小さいね");
		}
		
		// 1から10までの数字を表示するプログラムを書こう
		
		for (int b = 1; b <= 10; b++) {
			 System.out.println(b); } 
			 
		
	     //1から10までの偶数だけを表示するプログラムを書こう
	
         for (int c = 1; c <= 10; c ++) {
        	 if(c % 2 == 0){
        	    System.out.println(c);}
        		}

         // 九九の制作
         for (int i = 1; i <= 9; i ++) {
        	 for (int j = 1; j <= 9; j ++){
        		 System.out.println(i * j+ " ");
        	 }
        	 System.out.println();
         }
         
		/* キーボードから「グー」「チョキ」「パー」のいずれかを入力させ、
		 * 乱数でコンピューターの手を決めて、
		 * 勝敗を表示するじゃんけんプログラムを作成してください。
		 */
		 
         
         // プレイヤーの手を決める
         java.util.Scanner scanner = new java.util.Scanner(System.in);
         System.out.print("じゃんけんぽん!(グー・チョキ・パー):");
         String userhand = scanner.nextLine();
         
         
         // コンピューターの手を決める
         int computerHandNumber = (int)(Math.random() * 3);
         String computerHand = "";
         if(computerHandNumber == 0) {
        	 computerHand = "グー";
         }else if (computerHandNumber == 1){
        	 computerHand = "チョキ";
         }else{
        	 computerHand = "パー";
         }
         
         // 無効な入力手
         if(!userhand.equals("グー")&& !userhand.equals("チョキ")&& !userhand.equals("パー")) {
        	 System.out.println("無効な入力です");
        	 return;
         }
         
         System.out.println("コンピューターの手は:"+ computerHand);
         
         
         if (userhand.equals(computerHand)) {
        	 System.out.println("あいこです");
         }
         else if(
        		 (userhand.equals("グー")&& computerHand.equals("チョキ"))||
                 (userhand.equals("チョキ")&& computerHand.equals("パー"))||
                 (userhand.equals("パー")&& computerHand.equals("グー"))
                 ) {System.out.println("あなたの勝ちです!!");}
         else {System.out.println("あなたの負けです、、、");}
         
         scanner.close();
        
	
	}	

}
