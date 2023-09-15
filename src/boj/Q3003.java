package boj;

import java.util.*;
public class Q3003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		int E = scanner.nextInt();
		int F = scanner.nextInt();
		
		A = -A + 1;
		B = -B + 1;
		C = -C + 2;
		D = -D + 2;
		E = -E + 2;
		F = -F + 8;
		
		System.out.println(A + " " + B + " " + C + " " + D + " " + E + " " + F);
	}
}
