package lec13;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		//		int[] x;
//		x = new int[3];
// 		
//		x[0] = 1;
//		x[1] = 4;
//		x[2] = x[0]+x[1];
//		//OR do this
//		int[] y = {1,4,2};
//		
//		System.out.println(x[2]);
//		System.out.println(y);
		
		int[] ages = new int[20];
		ages[0] = 12;
		ages[19] = 1;
		System.out.println("eneter value for 2nd array: ");
		ages[1] = in.nextInt();
		System.out.println(ages.length);
		
	}
}
