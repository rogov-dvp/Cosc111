package lec14;

public class Ex2 {
	public static void main(String[] args) {
		
		int[] x = {1,2,3,4};
			//write code to create an identical array y
		int[] b = new int [x.length];
		
		System.arraycopy(x, 0, b, 0, x.length);
		for (int i = 0; i < x.length; i++) {
		System.out.print(x[i] + " ");
		}
		
		System.out.println();
		
		for(int item:x)							//"item" is just a variable name. Only reads it, not change it
			System.out.print(item + " ");
	}
}
