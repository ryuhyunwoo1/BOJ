package boj;

import java.util.*;

public class Q10818 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int[] B = new int[A];
		
		for (int i=0; i < A; i++) {
			B[i] = scanner.nextInt();
		}
		int C = B[0];
		int D = B[0];
		
		for (int j=0; j < B.length; j ++) {
			if (B[j] > C) {
				C = B[j];
			} 
			if (B[j] < D) {
				D = B[j];
			}
		}
		
		System.out.println(D + " " + C);
	}
}
