package boj;

import java.util.*;

/** https://www.acmicpc.net/problem/2588 **/

public class Q2588 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = Integer.parseInt(scanner.nextLine());
		String B = scanner.next();
		int S = Integer.parseInt(B);
		int C = (A * (B.charAt(2) - '0'));
		int D = (A * (B.charAt(1) - '0'));
		int E = (A * (B.charAt(0) - '0'));
		int F = A * S;
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		System.out.println(F);
	}
}
