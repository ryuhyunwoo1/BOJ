package boj;

import java.util.*;

public class Q10950 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int C = 1;
		
		while (C <= A) {
			C ++;
			int A1 = scanner.nextInt();
			int A2 = scanner.nextInt();
			System.out.println(A1 + A2);
		}
		
		
	}
}
