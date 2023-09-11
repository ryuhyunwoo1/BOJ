package boj;

import java.util.*;

public class Q10871 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int[] C = new int[A];
		
		for (int i=0; i < A; i++) {
			C[i] = scanner.nextInt();
		}
		
		for (int j=0; j < C.length; j++) {
			if (C[j] < B) {
				System.out.print(C[j] + " ");
			}
		}
				
	}
}
