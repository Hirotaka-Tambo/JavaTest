package jp.sample;
import java.util.ArrayList;
import java.util.List;

public class CaluculatorHistory {
	
	    private List<String> history = new ArrayList<>();

	    public void addRecord(String record) {
	        history.add(record);
	    }

	    public void showHistory() {
	        System.out.println("=== 計算履歴 ===");
	        for (String record : history) {
	            System.out.println(record);
	        }
	    }
}
