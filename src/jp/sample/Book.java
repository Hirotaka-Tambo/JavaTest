package jp.sample;

class Book {
	
	String title;
	String author;
	
	public Book(String title,String author){
		this.title = title;
		this.author = author;
	}
	
	void showInfo() {
		System.out.println("タイトル:"+ title+ "、著者:"+author);
	}
	
	

}
