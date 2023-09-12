package boj;

import java.util.*;
public class Q11720 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		String B = scanner.next();
		int C = 0;
	
		for (int i=0; i < A; i++) {
			C = C + (B.charAt(i) - '0');
	}
		System.out.print(C);
	}
}
	
