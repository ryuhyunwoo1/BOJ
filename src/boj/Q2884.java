package boj;
import java.util.*;
public class Q2884 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String A = scanner.next();
		String B = scanner.next();
		int C;
		
		if ( Integer.parseInt(A)>0 & Integer.parseInt(B) >= 45 ) {
			System.out.println(A + " " + (Integer.parseInt(B)-45));
		} else if (Integer.parseInt(A)>0 & Integer.parseInt(B) < 45){
			C = (Integer.parseInt(A) - 1);
			System.out.println((Integer.parseInt(A)-1) + " " + (Integer.parseInt(B)+15));
		} else if (Integer.parseInt(A)==0 & Integer.parseInt(B) >= 45 ) {
			System.out.println("0 " + (Integer.parseInt(B)-45));
		} else if (Integer.parseInt(A)==0 & Integer.parseInt(B) < 45) {
			System.out.println("23 " + (Integer.parseInt(B)+15));
		}
	}
}
