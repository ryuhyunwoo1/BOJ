package boj;

import java.util.*;
public class Q2908 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		int A = scanner.nextInt();
		int B = scanner.nextInt();
        
        scanner.close();
        
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		if (A > B) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}	
	}
}
