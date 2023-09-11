package boj;
import java.util.*;
public class Q2525 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		String C = scanner.next();
		int D = A*60 + B + Integer.parseInt(C);
		
		
		if (D < 1440) {
			System.out.println((D / 60) + " " + (D % 60));
		} else {
			D = D - 1440;
			System.out.println((D / 60) + " " + (D % 60));
		}
		
	}
}
