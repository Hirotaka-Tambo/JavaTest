package jp.sample;

import java.util.HashMap;
import java.util.Map;

public class UserHashMap {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	    Map<String, Integer> map = new HashMap<>();
	    
	    map.put("りんご", 100);
	    map.put("みかん", 80);
	    map.put("バナナ", 120);
	    
	    System.out.println("りんごの値段:"+ map.get("りんご"));
	    System.out.println("みかんの値段:"+ map.get("みかん"));
	    

	}

}
