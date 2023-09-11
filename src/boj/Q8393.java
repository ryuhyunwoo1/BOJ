package boj;

import java.util.*;

public class Q8393 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = 0;
		
		for (int i=0; i<A; i++) {
			B = B + (i + 1);
		}
		
		System.out.println(B);
	}
}
