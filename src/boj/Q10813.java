package boj;
import java.util.*;
public class Q10813 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int[] C = new int[A];
		int F;
		
		for (int i=0; i<A; i++) {
			C[i] = i+1;
		}
		
		for (int j=0; j<B; j++) {
			int D = scanner.nextInt();
			int E = scanner.nextInt();
			
			F = C[D-1];
			C[D-1] = C[E-1];
			C[E-1] = F;
		}
		
		for (int k=0; k<A; k++) {
			System.out.print(C[k] + " ");
		}
	}
}
