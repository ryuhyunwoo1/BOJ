package boj;

import java.util.*;

/** A + B, A - B, A / B, A % B **/

public class Q10869 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = A + B;
		int D = A - B;
		int E = A / B;
		int F = A % B;
		int G = A * B;
		System.out.println(C);
		System.out.println(D);
		System.out.println(G);
		System.out.println(E);
		System.out.println(F);
	}
}
