package jp.sample;

public class SumAverage {
	public static double[] calcStates(int[] numbers) {
		double sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		double ave = numbers.length > 0 ? sum /numbers.length : 0;
		double[] result = {sum, ave};
		return result;
		
	}
	
	public static void main(String[] args) {
		int[] data = {10,20,30,40,50};
		double[] stats = calcStates(data);
		System.out.println("合計:"+ stats[0]);
		System.out.println("平均"+ stats[1]);
	}
}
