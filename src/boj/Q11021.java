package boj;

import java.util.*;

public class Q11021 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		
		for (int i=1; i < A+1; i++) {
			int B = scanner.nextInt();
			int C = scanner.nextInt();
			System.out.println("Case #" + i + ": " + B + " + " + C + " = " + (B+C));
		}
		
		
	}
}
