package jp.sample;

public class BookExercise {

	public static void main(String[] args) {
		// ここでBookクラスのインスタンスを作成し、情報を表示してください
		newBook book = new newBook("吾輩は猫である","夏目漱石");
		
		book.displayInfo();
	}

}

class newBook{
	String title;
	String author;
	//コンストラクタをここに実装
	public newBook(String title, String author) {
		this.title = title;
		this.author = author;
	}
	//本の情報を表示するメソッドをここに実装
	public void displayInfo() {
		System.out.println("タイトル:"+this.title);
		System.out.println("著者:"+this.author);
	}
}