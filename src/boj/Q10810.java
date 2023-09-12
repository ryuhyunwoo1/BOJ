package boj;
import java.util.*;
public class Q10810 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int[] F = new int[A];
		
		for (int o=0; o<A; o++) {
			F[o] = 0;
		}
		
		for (int i=0; i<B; i++) {
			int C = scanner.nextInt();
			int D = scanner.nextInt();
			int E = scanner.nextInt();
			
			for (int j=C-1; j < D; j++) {
				F[j] = E;
			}
			
		}
		
		for (int i=0; i < A; i++) {
			System.out.print(F[i] + " ");
		}
		
	}
}
