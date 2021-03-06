package lec14;

public class Ex1 {
	public static void main(String[] args) {
	
	int[] a = {1,2,3,4,5};
	int[] b = {6,7,8,9,0};     // The value of B isn't technically "5,6,7", but an assiged memory location
	
	//1)copying b to a
//	for(int i = 1; i<=3 ; i++) {
//		a[i-1] = b[i];
//	}
//	
	//2) using system.arraycopy()
	System.arraycopy(b, 2, a, 1, 3); // takes elements starting from index2 (3rd number) and starts adding them at index1(2nd number) of a, for 3 length
	
	
							//a=b; a's memory location equals to b, SOooooo...
							// When you change something of a, b is changed since their memory location is the same
						   // The elements of the original a ( 1,2,3) are deleted since nothing references or points to it
	
	
	System.out.print("A: ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
	System.out.println();
	System.out.print("B: ");
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i] + " ");
	}
		
		
	}
}
