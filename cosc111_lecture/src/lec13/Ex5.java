package lec13;

public class Ex5 {
	public static void main(String[] args) {
		
		int[] x = {5,1,4,6,8,-1,-5,1,10};
		//find min elements
		int max = x[0], min =x[0];
				for (int i = 0; i < x.length; i++) {
					if (x[i]<min) min = x[i];
					if (x[i]>max) max = x[i];
				}
				System.out.println("max:" + max);
				System.out.println("min:" + min);
	}
}