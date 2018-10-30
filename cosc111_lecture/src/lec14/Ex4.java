package lec14;

import java.util.Arrays;

public class Ex4 {
	public static void main(String[] args) {
		int[] a = getRandomArray(10, 0 ,10);
		Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	}
	
	public static int[] getRandomArray(int n, int a, int b) {
		int[] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =(int)(a + Math.random()*(b-a));
		}
		return arr;
	}
}
