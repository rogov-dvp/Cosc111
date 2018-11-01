package lec15;

public class Ex5 {
	public static void main(String[] args) {
		int[][] x = {              // rows and columns start at 0, like the arrays they are
				
				{1,2,3}, // 0,1,2
				{1,2,}, // 0,1,2
				{1,2,4,5,6}, // 0,1,2
				{1,2,7,8}
							
		};
		//for-each
		for(int[] row: x) {
			for(int col: row) {
					System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
