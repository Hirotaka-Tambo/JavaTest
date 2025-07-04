package jp.sample;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Book> list = new ArrayList<>();
		
		list.add(new Book("吾輩は猫である", "夏目漱石"));
		list.add(new Book("こころ", "夏目漱石")); 
	    list.add(new Book("人間失格", "太宰治")); 
	    
	    for(Book book : list) {
	    	book.showInfo();
	    }
		

	}

}
