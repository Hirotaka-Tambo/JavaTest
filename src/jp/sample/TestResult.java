package jp.sample;

public class TestResult {
    // static 変数 totalScore, studentCount を定義
    public static int totalScore = 0;
    public static int studentCount = 0;
    	
	
    public TestResult(int score) {
        // 合計点と人数を更新
    	totalScore += score;
    	studentCount++;
    }

    public static double average() {
        // 平均点を返す
    	if(studentCount == 0) {
    		return 0.0;
    	}
    	return  (double) totalScore / studentCount;
    }

    public static void main(String[] args) {
        new TestResult(80);
        new TestResult(90);
        new TestResult(70);
        // 平均点を表示
        
        System.out.println(average());
    }
}