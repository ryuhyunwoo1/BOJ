package boj;

import java.util.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/** The number of words **/

public class Q1152 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		
		StringTokenizer st = new StringTokenizer(S, " ");
		
		System.out.println(st.countTokens());
	}
}
