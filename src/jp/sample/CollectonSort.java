package jp.sample;
import java.util.ArrayList;
import java.util .Collections;

public class CollectonSort {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(8);
		numbers.add(1);
		numbers.add(3);
		
		Collections.sort(numbers);// 昇順に並べ替える // Collections.sortの戻り値は基本的にvoid
		System.out.println(numbers);

		Collections.reverse(numbers);// 降順に並べ替える
		System.out.println(numbers); 
		
		ArrayList<Integer> lists = new ArrayList<>();
		
		lists.add(1);
		lists.add(2);
		lists.add(3);
		
		System.out.println(lists);
		Collections.sort(lists,Collections.reverseOrder()); // 降順に並べ替える
		System.out.println(lists);
		
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("apple");
		fruits.add("banana");
		
		System.out.println(fruits);
		
		ArrayList<String> copy = new ArrayList<>(fruits);
		copy.add("cherry");
		System.out.println(copy);
		
		
		
		
;	}

}
