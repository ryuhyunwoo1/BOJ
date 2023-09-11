package boj;

import java.util.*;

public class Q25314 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = A / 4;
		
		for (int i=0; i<B; i++) {
			System.out.print("long ");
		}
		
		System.out.print("int");
	}
}
