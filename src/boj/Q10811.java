package boj;

import java.util.*;

public class Q10811 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int[] D = new int[A+1];
		
		for (int i=1; i<A+1; i++) {
			D[i] = i;
		}
		
		for (int i=1; i<B+1; i++) {
			int E = scanner.nextInt();
			int F = scanner.nextInt();
			int G;
			
			for (int j=E; j<(E+(F-E)/2)+1; j++) {
				G = D[j];
				D[j] = D[F+E-j];
				D[F+E-j] = G;
			}
		}
		
		for (int i=1; i<A+1; i++) {
			System.out.print(D[i] + " ");
		}
	}
}
