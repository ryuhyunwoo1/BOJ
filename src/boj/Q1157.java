package boj;

import java.util.*;
public class Q1157 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String A = scanner.next();
		
		int[] B = new int[A.length()];
		
		for (int i=0; i<A.length(); i++) {
			B[i] = 0;
		}
		
		for (int i=0; i<A.length(); i++) {
			for (int j=0; j<A.length(); j++) {
				if (A.charAt(i) == A.charAt(j)) {
					B[i] = B[i] + 1;
				}
			}			
		}
		
		int C = 1;
		char D;
		
		for (int i=0; i<A.length(); i++) {
			if (B[i] > C) {
				C = B[i];
				D = A.charAt(i);
			}
		}
		
		System.out.println(C);
	}
}
