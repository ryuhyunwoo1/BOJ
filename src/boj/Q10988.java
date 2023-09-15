package boj;

import java.util.*;
public class Q10988 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String A = scanner.next();
		int B = 1;
		
		for (int i=0; i<A.length(); i++) {
			if (A.charAt(i) == A.charAt(A.length()-i-1)) {
				
			} else {
				B = 0;
			}
		}
		
		System.out.println(B);
	}
}
