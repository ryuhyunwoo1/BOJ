package boj;

import java.util.*;
public class Q11718 {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	String[] A = new String[100];
	int B = 0;
	
	for (int i=0; i<100; i++) {
		A[i] = scanner.nextLine();
		
		if (A[i] == "") break;
	}
	
	for (int i=0; i<100; i++) {
		System.out.println(A[i]);
		
		if (A[i] == "") break;
	}
	
	}
}