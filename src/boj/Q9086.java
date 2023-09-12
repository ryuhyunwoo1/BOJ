package boj;

import java.util.*;
public class Q9086 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		String[] B = new String[A+1];
		
		for (int i=1; i<A+1; i++) {
			B[i] = scanner.next();
		}
		
		scanner.close();
		
		for (int i=1; i<A+1; i++) {
			if (B[i].length() < 1) {
				System.out.println(B[i] + "" + B[i]);
			} else {
				System.out.print(B[i].substring(0,1));
				System.out.println((B[i].substring(B[i].length() - 1, B[i].length())));
			}
		}
	}
}
