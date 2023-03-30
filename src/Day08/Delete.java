package Day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Delete {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int a[] = new int[n];
		for(int i = 0; i < a.length; i++) {
			st = new StringTokenizer(br.readLine());
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		for (int i = n-1; i >= 0; i--) {
			if(a[i] <= k) {
				count += (k / a[i]);
				k = k % a[i];
			}
		}
		
		System.out.println(count);
	}

}
