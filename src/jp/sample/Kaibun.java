package jp.sample;

public class Kaibun {
	    public static void main(String[] args) {
	        System.out.println(isPalindrome("level"));   // 出力: true
	        System.out.println(isPalindrome("hello"));   // 出力: false
	    }

	    public static boolean isPalindrome(String str) {
	        // 1. 文字列を小文字に変換し、空白を削除
	        str = str.toLowerCase().replace(" ", "");

	        // 2. 反転した文字列と比較
	        String reversed = new StringBuilder(str).reverse().toString();

	        return str.equals(reversed);  // 元の文字列と反転した文字列を比較
	    }

}
