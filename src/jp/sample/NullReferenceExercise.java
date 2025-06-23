package jp.sample;

public class NullReferenceExercise {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car car1 = new Car("プリウス", 2022);
        Car car2 = null;
        
        printCarInfo(car1);
        printCarInfo(car2);
        
        // car1 を null に設定
        car1 = null;
        
        printCarInfo(car1);
    }
    
    public static void printCarInfo(Car car) {
        // nullチェックを行い、安全に車の情報を表示するメソッドを実装
    	if(car == null) {
    		System.out.println("Nothig");
    	}else {
    		System.out.println("車名:"+car.getName()+ ", 年式:"+ car.getyear());
    	}
    	
    }

}

class Car{
	private String name;
	private int year;
	
	//コンストラクタ
	public Car(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	public int getyear() {
		return year;
	}
	
}

