package boj;

import java.util.*;
public class Q1546 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		double[] B = new double[A+1];
		double C = 0;
		int D = 0;
		double F = 0;
		
		for (int i=1; i<A+1; i++) {
			B[i] = scanner.nextInt();
			if (B[i] > F) {
				F = B[i];
			}
			D = D + 1;
		}
		
		double G = F;
		
		for (int i=1; i<A+1; i++) {
			B[i] = B[i]*100/G;
			C = C + B[i];
		}
		
		double E = (double) C / D;
		
		System.out.println(E);
	}
}
