package Day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz03 {
	static int arr[];
	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		arr = new int[n + 1];

		for (int i = 1; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		ReturnFunction(k);
		System.out.println(count);
	}

	private static void ReturnFunction(int k) {

		for (int i = arr.length - 1; i >= 1; i--) {

			if (arr[i] <= k) {
				count += k / arr[i];
				int remain = k % arr[i];

				if (remain != 0) {
					ReturnFunction(remain);
				}

				return;
			}
		}

	}

}
