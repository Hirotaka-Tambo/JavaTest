package jp.sample;

public class Stuudent {
	// ここに stuatic 変数を定義
    static int count = 0;
	
	public Stuudent() {
        // ここでカウントを増やす
		count ++;
    }
    public static void showCount() {
        // カウントを表示
    	System.out.println("作られた人数:"+ count);
    }
    
    public static void main(String[] args) {
        new Stuudent();
        new Stuudent();
        // 作られた人数を表示
        Stuudent.showCount();
    }

}
