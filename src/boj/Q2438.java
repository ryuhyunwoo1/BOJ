package boj;

import java.util.*;
public class Q2438 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		
		for (int i=1; i < A+1; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}
