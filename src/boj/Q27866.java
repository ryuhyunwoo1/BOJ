package boj;

import java.util.*;

public class Q27866 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		String A = scanner.next();
		int B = scanner.nextInt();
		
		System.out.println(A.charAt(B-1));
	}
}
