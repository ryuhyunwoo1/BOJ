package boj;

import java.util.Scanner;

public class Q10809 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
 		int[] A = new int[26];
		
		for(int i = 0; i < A.length; i++) {
			A[i] = -1;
		}
 
		String B = scanner.nextLine();
 
		for(int i = 0; i < B.length(); i++) {
			char C = B.charAt(i);
    
			if(A[C - 'a'] == -1) {	
				A[C - 'a'] = i;
			}
		}
 
		for(int i=0; i<26; i++) {	// 배열 출력
			System.out.print(A[i] + " ");
		}
	}
}
