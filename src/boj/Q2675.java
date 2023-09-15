package boj;

import java.util.*;
public class Q2675 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		String[] E = new String[A];
		
		for (int i=0; i<A; i++) {
			E[i] = "";
		}
		
		for (int i=0; i<A; i++) {
			int C = scanner.nextInt();
			String D = scanner.next();
				for (int m=0; m<D.length(); m++) {
					for (int j=0; j<C; j++) {
						E[i] = E[i] + (D.charAt(m));
					}
				}
		}
		
		for (int i=0; i<A; i++) {
			System.out.println(E[i]);
		}
	}
}
