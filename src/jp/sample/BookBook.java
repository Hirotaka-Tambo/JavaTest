package jp.sample;	
import java.util.LinkedHashMap;
import java.util.Map;

public class BookBook {
	    public static void main(String[] args) {
	        // Mapの作成（順番を保持したいので LinkedHashMap を使用）
	        Map<String, Book> bookMap = new LinkedHashMap<>();

	        // BookオブジェクトをMapに追加
	        bookMap.put("978-4-04-109271-5", new Book("騎士団長殺し", "村上春樹"));
	        bookMap.put("978-4-10-120027-4", new Book("プラチナデータ", "東野圭吾"));
	        bookMap.put("978-4-06-293851-3", new Book("流浪の月", "凪良ゆう"));

	        // 出力（ISBNコードを最初に表示）
	        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
	            String isbn = entry.getKey();
	            Book book = entry.getValue();

	            System.out.print("ISBNコード: " + isbn + " → ");
	            book.showInfo();
	        }
	    }

}
