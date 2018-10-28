package ex6;

import java.util.Scanner;

public class Q3 {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a password: ");
	String userPass = in.nextLine();
	
	
	if(isValidPassword(userPass)) {
		System.out.println("Valid");
	} else {
		System.out.println("Invalid");
		}
	
	in.close();
	}

	public static boolean isValidPassword(String s) {
		
		boolean password = false;
		String abc = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		int passIndexABC = 0; //1
		int passIndexNUM = 0;
		int passLength = 0; //1
		int passNumberLength = 0;
		
		for(int i = 0; passIndexABC < s.length(); i++) {
			if(s.toLowerCase().charAt(passIndexABC) == abc.charAt((i))){
				passIndexABC++;
				passLength++;
				i = 0;
			} else if (i== 25) {
				passIndexABC++;
				i=0;
			}
		}
				
		for(int r = 0; passIndexNUM < s.length(); r++) {
			if(s.charAt(passIndexNUM) == num.charAt(r)){
				passIndexNUM++;
				passLength++;
				passNumberLength++;
				r = 0;
			} else if (r == 9) {
				passIndexNUM++;
				r=0;
			}
		}

		if (passLength >= 8 && passNumberLength >=2 && s.length() == passLength) {
			password = true;
		}	
		
	return password;
	}
}