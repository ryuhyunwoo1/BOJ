package boj;

import java.util.*;

public class Q9498 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();

		if ( A >= 90 & A <= 100) {
			System.out.println("A");
		} else if (A >= 80 & A <= 89) {
			System.out.println("B");
		} else if (A >= 70 & A <= 79) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
}
