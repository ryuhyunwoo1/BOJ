package boj;

import java.util.*;

public class Q10952 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			
			if (A==0 & B==0) {
				break;
			} else {
				System.out.println(A+B);

			}
		}
	}
}
