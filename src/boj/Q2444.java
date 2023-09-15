package boj;

import java.util.*;
public class Q2444 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		
		for (int i=1; i<2*A/2+1; i++) {
			String B = " ";
			String C = "*";
			System.out.println(B.repeat(A-i) + C.repeat(2*i-1) + B.repeat(A-i));
		}
		for (int i=2*A/2+1; i<2*A; i++) {
			String B = " ";
			String C = "*";
			System.out.println(B.repeat(i-A) + C.repeat(4*A-1 - i*2) + B.repeat(i-A));
		}
	}
}
