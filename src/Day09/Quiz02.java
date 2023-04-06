package Day09;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int D[] = new int[n+1];
		
		D[0] = 0;
		D[1] = 1;
		
		for(int i = 2; i < D.length; i++) {
			D[i] = D[i-2] + D[i-1];
		}
		
		System.out.println(D[n]);
				
	}
}
