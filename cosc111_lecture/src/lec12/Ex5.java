package lec12;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);
//		int x = 5;
//		
//		int[] values = {5,1,3,6,2};
		
		
//		/			while (!((end.toLowerCase().equals(no)) | (end.toLowerCase().equals(yes)))) {
//			 game.askForText("Invalid input. Play again?(Y/N)");
//		 }
		String yes = "y";
		String no = "n";
		
		
		System.out.print("Do you want to play again?(Y/N) ");
		String end = in.nextLine();
		
//		while (!end.toLowerCase().equals(no) && !end.toLowerCase().equals(yes))
		while (!end.toLowerCase().equals("n") 
				&& !end.toLowerCase().equals("y")){
			System.out.println("Invalid answer. Try again (Y/N)");
			end = in.nextLine();
		}
		
		System.out.println("gucci");
}
}
