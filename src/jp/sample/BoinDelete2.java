package jp.sample;

public class BoinDelete2 {
	
	    public static void main(String[] args) {
	        System.out.println(removeVowels("Hello World"));  // 出力: Hll Wrld
	    }

	    public static String removeVowels(String str) {
	        String vowels = "aeiouAEIOU";  // 母音の文字列
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (vowels.indexOf(ch) == -1) {  // 母音が含まれていなければ追加
	                result.append(ch);
	            }
	        }
	        return result.toString();
	    }

}
