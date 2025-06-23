package jp.sample;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		 // 演習1::ArrayList 型の変数 numbers が用意されています。コードを追加して、変数 numbers の要素を昇順に並び替えて、出力してください。

	     ArrayList<Integer> numbers = new ArrayList<>();
		 numbers.add(8);
		 numbers.add(1);
		 numbers.add(3);
		        // 以下にコードを追加
		        
		 Collections.sort(numbers);
		 System.out.println(numbers);
		 
		 /*演習2::ArrayList型の変数 members が用意されています。
		   コードを追加して、変数 members をコピーした ArrayList 型の変数 members_copy を作成した後、
		   変数 members_copy の末尾に `nara` を追加して、出力してください。*/
		 
		 ArrayList<String> members = new ArrayList<>();
	     members.add("kirishima");
	     members.add("midorikawa");
	     members.add("rokumura");
	        //以下にコードを追加
	     
	     ArrayList<String> members_copy = new ArrayList<>(members);
	     
	     members_copy.add("nara");
	     
	     System.out.println("members：" + members);
	     System.out.println("members_copy：" + members_copy);
	     
	     
	     
	     // 応用1::2つのArrayListを結合して新しいリストを作成し、結合後のリストをアルファベット順にソートしてください

	     ArrayList<String> fruits1 = new ArrayList<>();
	        fruits1.add("apple");
	        fruits1.add("banana");
	        fruits1.add("orange");
	        
	     ArrayList<String> fruits2 = new ArrayList<>();
	        fruits2.add("grape");
	        fruits2.add("kiwi");
	        fruits2.add("melon");
	        
	        // ここに2つのリストを結合し、ソートするコードを追加
	        
	       ArrayList<String> combinedFruits = new ArrayList<>(fruits1);
	       combinedFruits.addAll(fruits2);
	       Collections.sort(combinedFruits);
	        // 出力結果: [apple, banana, grape, kiwi, melon, orange]
	        System.out.println(combinedFruits);


     }


}
