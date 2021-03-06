package assignment6;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.print("Enter a positive integer: ");
		int num = in.nextInt();
		
		if (isPalindrome(num) == true)
		System.out.printf("%d is a palindrome",num);
		else
		System.out.printf("%d is not a palindrome",num);
		in.close();
	}
	
	public static int reverse(int number) {
		
		String numStringF = String.valueOf(number);  //changing int to String		
		int numStringF2 = numStringF.length() - 1;
		int reverse = 0;
		int reverse2 = 0;
		
		for (int i = numStringF2; i >= 0 ; i--) {
			int numR = numStringF.charAt(i) - 48;    //numR -> "number reversed" //4, i =4
				reverse = numR * (int)(Math.pow(10, i)); // eg.num=3456 -> 6000+500+40+3=6543
				reverse2 += reverse; 
			
		}
		return reverse2;
	}
	
	public static boolean isPalindrome(int number) {
		
		boolean status = false;
				
		if (number == reverse(number))
			status = true;

		return status;
	}
}
