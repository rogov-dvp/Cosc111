package lec13;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
//		int[] nums = new int[100];
//		for (int i =0; i< nums.length ;i++)
//			nums[i] = 5;
		double sum = 0;
		System.out.println("how many elements? ");
		int N = in.nextInt();
		int[] nums2 = new int[N];
		for (int i = 0; i< nums2.length;i++) {
			System.out.print("Input for #" + (i+1) + " " );
			nums2[i] = in.nextInt();	
			sum += nums2[i];
		}
		
		System.out.println("Your array values: ");
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] +  " ");
		}
		
		System.out.printf("\nThe sum is: " + sum);
		System.out.println();
		double avg = sum/N;
		System.out.println("The average: " + avg/1.0);
		
		int counterA = 0;
		int counterB = 0;
		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] > avg) {
				counterA++;
			} else if (nums2[i] < avg) {
				counterB++;
			}
		}
		System.out.println("num above the average " + counterA);
		
		
	}
}
