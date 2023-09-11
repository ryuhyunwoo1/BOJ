package boj;

import java.util.*;

public class Q25304 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int E = 0;


		for(int i=0;i < B;i++) {
			int C = scanner.nextInt();
			int D = scanner.nextInt();
			E = C * D + E;
		}
		
		if (E == A) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
