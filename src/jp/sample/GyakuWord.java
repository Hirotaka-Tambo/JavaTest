package jp.sample;

public class GyakuWord {
	    public static void main(String[] args) {
	        System.out.println(reverseWords("Hello World Java"));  // 出力: Java World Hello
	    }

	    public static String reverseWords(String str) {
	        // 1. 文字列を単語に分割
	        String[] words = str.split(" ");
	        
	        // 2. 単語を逆順に並べる
	        StringBuilder result = new StringBuilder();
	        
	        for (int i = words.length - 1; i >= 0; i--) {
	            result.append(words[i]);  // 単語を追加
	            if (i > 0) {
	                result.append(" ");  // 単語間にスペースを追加
	            }
	        }

	        return result.toString();
	    }

}
