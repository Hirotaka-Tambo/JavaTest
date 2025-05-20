package jp.sample;

public class Reverse {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = "Hello";
		
		String rs = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            rs += str1.charAt(i); // 1文字ずつ追加
        }


        System.out.println("反転結果(StringOnly): " + rs);

        // Java標準の StringBuilder を使用
        StringBuilder sb = new StringBuilder(str1);

        String reversed = sb.reverse().toString();

        System.out.println("反転した文字列: " + reversed);
        
        
        // 演習２ 文字のカウント
        
        String input = "Hello World";
        char target = 'l';

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("出現回数: " + count);
        
        
	}

}
