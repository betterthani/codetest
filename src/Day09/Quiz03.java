package Day09;

import java.util.Scanner;

public class Quiz03 {
	static int D[];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		D = new int[n + 1];

		for (int i = 0; i < D.length; i++) {
			D[i] = -1;
		}

		D[0] = 0;
		D[1] = 1;

		fibo(n);
		System.out.println(D[n]);

	}

	static int fibo(int n) {
		if (D[n] != -1) {
			return D[n];
		}
		return D[n] = fibo(n - 2) + fibo(n - 1);
	}

}
