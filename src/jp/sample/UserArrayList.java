package jp.sample;

import java.util.ArrayList;
import java.util.List; 
	 
public class UserArrayList { 
	  public static void main(String[] args) { 
	    List<String> list = new ArrayList<>();  // String型のArrayListを作成 
	    list.add("りんご"); 
	    list.add("みかん"); 
	    list.add("バナナ");
	    list.add("もも");
	 
	    for (int i = 0; i < list.size(); i++) { 
	      System.out.println(list.get(i));  // 要素にアクセス 
	    }
	    
	    System.out.println("---");
	    
	    for(String fruit: list) {
	    	System.out.println(fruit); //拡張for文
	    }
	}   
}
