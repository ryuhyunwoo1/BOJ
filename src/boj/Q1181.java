package boj;

import java.util.*;

public class Q1181 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		String[] B = new String[A];
		
		scanner.nextLine();

		
		for (int i=0; i < A; i++) {
			B[i] = scanner.nextLine();
		}
		
		Arrays.sort(B, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}
		});
		
		System.out.println(B[0]);
		
		for (int i = 1; i <A; i ++) {
			if (!B[i].equals(B[i-1])) {
				System.out.println(B[i]);
			}
		}
	}
}
