package boj;

import java.util.*;

public class Q2562 {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	int[] A = new int[9];
	
	for (int i=0; i < 9; i++){
		A[i] = scanner.nextInt();
	}
	
	int B = A[0];
	int C = 0;
	int D = 1;
	
	for (int j=0; j < A.length; j++) {
		C = C+1;
		if (A[j] > B) {
			B = A[j];
			D = C;
		}
	}
	
	System.out.println(B);
	System.out.println(D);
	}
}
