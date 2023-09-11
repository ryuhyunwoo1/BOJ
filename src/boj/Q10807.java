package boj;

import java.util.Scanner;

public class Q10807 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = 0;
		int[] C = new int[A];
		
		for (int i=0; i < A; i++) {
			C[i] = scanner.nextInt();
		}
		int D = scanner.nextInt();
		
		for (int j=0; j < C.length; j++) {
			if (C[j] == D) {
				B = B + 1;
			}
		}
		
		System.out.println(B);

    }
}
