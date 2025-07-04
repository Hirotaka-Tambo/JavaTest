package jp.sample;
import java.util.ArrayList;

public class KataInstance {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		 // 1. Player型の変数にPlayerクラスのインスタンスを代入
        Player player = new Player();
        // 2. String型の変数に文字列 "Java" を代入
        String language = "Java";
        // 3. Integer型の変数に数値 42 を代入
        Integer value = 42;
        // 4. ArrayList型の変数に新しいArrayListを代入
        ArrayList<String> items = new ArrayList<>();

        // 出力して確認
        System.out.println("プレイヤーを作成しました");
        System.out.println("使用言語: " + language);
        System.out.println("値: " + value);
        System.out.println("アイテム数: " + items.size());
    }
}

class Player {
    // Playerクラスの定義

		

	}


