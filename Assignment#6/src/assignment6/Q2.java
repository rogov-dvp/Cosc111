package assignment6;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three sides in double: ");
		double side1 = in.nextDouble();
		double side2 = in.nextDouble();
		double side3 = in.nextDouble();
		while(isValid(side1,side2,side3)==false) {
			System.out.println("Invalid answer. Try again: ");
			System.out.print("Enter three sides in double: ");
			side1 = in.nextDouble();
			side2 = in.nextDouble();
			side3 = in.nextDouble();
		}
		in.close();
		
		System.out.println(area(side1,side2,side3));
			
	}
	
	public static boolean isValid(double sid1, double sid2, double sid3) {
		
		boolean status = false;
		
		double sum12 = sid1 + sid2; // greater vs sid3?
		double sum13 = sid1 + sid3; // greater vs sid2?
		double sum23 = sid2 + sid3; // greater vs sid1?
		
		if (sum12>sid3 && sum13>sid2 && sum23>sid1) 
			status = true;
		
		return status;
	}
	
	public static double area(double sid1, double sid2, double sid3) {
	
		double s = (sid1+sid2+sid3)/2;
		double area = Math.sqrt((s*(s-sid1)*(s-sid2)*(s-sid3)));
		
		return area;
	}	
}
