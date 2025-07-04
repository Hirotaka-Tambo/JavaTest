package jp.sample;

public class ConstructorOverloadingExercise {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5);
        Rectangle rect3 = new Rectangle(3, 4);
        
        System.out.println("rect1の面積: " + rect1.area());
        System.out.println("rect2の面積: " + rect2.area());
        System.out.println("rect3の面積: " + rect3.area());
    }
}

class Rectangle {
    int width;
    int height;
    
    // 複数のコンストラクタをここに実装
    public Rectangle() {
    	this.width = 1;
    	this.height = 1;
    }
    public Rectangle(int size) {
    	this.width = size;
    	this.height = size;
    }
    
    public Rectangle(int width, int height) {
    	this.width = width;
    	this.height = height;
    }
 
    
    // 面積を計算するメソッドをここに実装
    public int area() {
    	return width * height;
	}

}
