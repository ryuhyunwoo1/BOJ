package boj;

import java.util.*;
public class Q5622 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String A = scanner.next();
		
		int B = 0;
		int C = A.length();
		
		for (int i=0; i<C; i++) {
			
			switch(A.charAt(i)) {
			
			case 'A' : case 'B' : case 'C' :
				B = B + 3;
				break;
				
			case 'D' : case 'E' : case 'F' :
				B = B + 4;
				break;
			
			case 'G' : case 'H' : case 'I' :
				B = B + 5;
				break;
				
			case 'J' : case 'K' : case 'L' :
				B = B + 6;
				break;
				
			case 'M' : case 'N' : case 'O' :
				B = B + 7;
				break;
			
			case 'P' : case 'Q' : case 'R' : case 'S' :
				B = B + 8;
				break;
			
			case 'T' : case 'U' : case 'V' :
				B = B + 9;
				break;
			
			case 'W' : case 'X' : case 'Y' : case 'Z' :
				B = B + 10;
				break;
				
				
			
			}
		}
		System.out.println(B);
	}
}
